package com.luban.mall.service;

import com.luban.mall.domain.FlashPromotionSessionExt;
import com.luban.mall.model.SmsFlashPromotion;
import com.luban.mall.model.SmsFlashPromotionSession;

import java.util.Date;
import java.util.List;

/**
 * @description: 秒杀业务处理Service
 * @Author: 伯乐
 * @Date: 2019/5/20
 **/
public interface SmsFlashPromotionService {

    /**
     * 获取下一个场次信息
     * @param date
     *        当前时间
     * @return
     *         com.luban.mall.model.SmsFlashPromotionSession
     */
    SmsFlashPromotionSession getFlashPromotionSession(Date date);

    /**
     * 获取下一个场次信息
     * @param date
     *        当前时间
     * @return
     *          com.luban.mall.model.SmsFlashPromotionSession
     */
    SmsFlashPromotionSession getNextFlashPromotionSession(Date date);

    /**
     * 根据日期时间获取秒杀活动
     * @param date
     *        当前日期
     * @return
     *        com.luban.mall.model.SmsFlashPromotion
     */
    SmsFlashPromotion getFlashPromotion(Date date);

    /**
     * 获取当前日期秒杀活动所有场次
     */
    List<FlashPromotionSessionExt> getFlashPromotionSessionList();

}
