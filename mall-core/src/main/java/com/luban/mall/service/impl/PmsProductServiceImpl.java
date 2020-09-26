package com.luban.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.luban.mall.dao.FlashPromotionProductDao;
import com.luban.mall.dao.PortalProductDao;
import com.luban.mall.domain.FlashPromotionProduct;
import com.luban.mall.domain.PmsProductParam;
import com.luban.mall.service.PmsProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 伯乐
 * @Date: 2019/5/20
 **/
@Slf4j
@Service
public class PmsProductServiceImpl implements PmsProductService {

    @Autowired
    private PortalProductDao portalProductDao;

    @Autowired
    private FlashPromotionProductDao flashPromotionProductDao;

    /**
     * add by bole
     * 获取商品详情信息
     * @param id 产品ID
     */
    @Override
    public PmsProductParam getProductInfo(Long id,Long flashPromotionId,Long flashPromotionSessionId){
        return portalProductDao.getProductInfo(id,flashPromotionId,flashPromotionSessionId);
    }

    /**
     * add by bole
     * 获取秒杀商品列表
     * @param flashPromotionId 秒杀活动ID，关联秒杀活动设置
     * @param sessionId 场次活动ID，for example：13:00-14:00场等
     */
    @Override
    public List<FlashPromotionProduct> getFlashProductList(Integer pageSize, Integer pageNum, Long flashPromotionId, Long sessionId){
        PageHelper.startPage(pageNum,pageSize,"sort desc");
        return flashPromotionProductDao.getFlashProductList(flashPromotionId,sessionId);
    }
}
