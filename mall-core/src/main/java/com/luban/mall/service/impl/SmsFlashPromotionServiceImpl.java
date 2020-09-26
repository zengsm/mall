package com.luban.mall.service.impl;

import com.luban.mall.domain.FlashPromotionSessionExt;
import com.luban.mall.util.DateUtil;
import com.luban.mall.mapper.SmsFlashPromotionMapper;
import com.luban.mall.mapper.SmsFlashPromotionSessionMapper;
import com.luban.mall.model.SmsFlashPromotion;
import com.luban.mall.model.SmsFlashPromotionExample;
import com.luban.mall.model.SmsFlashPromotionSession;
import com.luban.mall.model.SmsFlashPromotionSessionExample;
import com.luban.mall.service.SmsFlashPromotionService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @description: 秒杀业务处理Service
 * @Author: 伯乐
 * @Date: 2019/5/20
 **/
@Service
public class SmsFlashPromotionServiceImpl implements SmsFlashPromotionService {
    @Autowired
    private SmsFlashPromotionMapper flashPromotionMapper;
    @Autowired
    private SmsFlashPromotionSessionMapper promotionSessionMapper;

    /*
     * 结果缓存redis，缓存key的前缀
     */
    private static final String cache_prefix="seckill:promotion:sessionid:";

    //根据时间获取秒杀场次
    public SmsFlashPromotionSession getFlashPromotionSession(Date date) {
        Date currTime = DateUtil.getTime(date);
        SmsFlashPromotionSessionExample sessionExample = new SmsFlashPromotionSessionExample();
        //获取时间段内的秒杀场次
        sessionExample.createCriteria()
                .andStatusEqualTo(1)//启用状态
                .andStartTimeLessThanOrEqualTo(currTime)
                .andEndTimeGreaterThanOrEqualTo(currTime);
        List<SmsFlashPromotionSession> promotionSessionList = promotionSessionMapper.selectByExample(sessionExample);
        if (!CollectionUtils.isEmpty(promotionSessionList)) {
            return promotionSessionList.get(0);//时间段交叉，则只取第一个
        }
        return null;
    }

    //获取下一个场次信息
    public SmsFlashPromotionSession getNextFlashPromotionSession(Date date) {
        SmsFlashPromotionSessionExample sessionExample = new SmsFlashPromotionSessionExample();
        sessionExample.createCriteria()
                .andStatusEqualTo(1)
                .andStartTimeGreaterThan(date);
        sessionExample.setOrderByClause("start_time asc");
        List<SmsFlashPromotionSession> promotionSessionList = promotionSessionMapper.selectByExample(sessionExample);
        if (!CollectionUtils.isEmpty(promotionSessionList)) {
            return promotionSessionList.get(0);
        }
        return null;
    }

    //根据时间获取秒杀活动
    public SmsFlashPromotion getFlashPromotion(Date date) {
        Date currDate = DateUtil.getDate(date);
        SmsFlashPromotionExample example = new SmsFlashPromotionExample();
        example.createCriteria()
                .andStatusEqualTo(1)
                .andStartDateLessThanOrEqualTo(currDate)
                .andEndDateGreaterThanOrEqualTo(currDate);
        List<SmsFlashPromotion> flashPromotionList = flashPromotionMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(flashPromotionList)) {
            return flashPromotionList.get(0);
        }
        return null;
    }

    /**
     * 获取当前日期秒杀活动所有场次
     * @return
     */
    public List<FlashPromotionSessionExt> getFlashPromotionSessionList(){
        Date now = new Date();
        SmsFlashPromotion promotion = getFlashPromotion(now);
        if(promotion != null){
            SmsFlashPromotionSessionExample sessionExample = new SmsFlashPromotionSessionExample();
            //获取时间段内的秒杀场次
            sessionExample.createCriteria().andStatusEqualTo(1);//启用状态
            sessionExample.setOrderByClause("start_time asc");
            List<SmsFlashPromotionSession> promotionSessionList = promotionSessionMapper.selectByExample(sessionExample);
            List<FlashPromotionSessionExt> extList = new ArrayList<>();
            if(!CollectionUtils.isEmpty(promotionSessionList)){
                promotionSessionList.stream().forEach((item)->{
                    FlashPromotionSessionExt ext = new FlashPromotionSessionExt();
                    BeanUtils.copyProperties(item,ext);
                    ext.setFlashPromotionId(promotion.getId());
                    if(DateUtil.getTime(now).after(DateUtil.getTime(ext.getStartTime()))
                            && DateUtil.getTime(now).before(DateUtil.getTime(ext.getEndTime()))){
                        //活动进行中
                        ext.setSessionStatus(0);
                    }else if(DateUtil.getTime(now).after(DateUtil.getTime(ext.getEndTime()))){
                        //活动即将开始
                        ext.setSessionStatus(1);
                    }else if(DateUtil.getTime(now).before(DateUtil.getTime(ext.getStartTime()))){
                        //活动已结束
                        ext.setSessionStatus(2);
                    }
                    extList.add(ext);
                });
                return extList;
            }
        }
        return null;
    }

}
