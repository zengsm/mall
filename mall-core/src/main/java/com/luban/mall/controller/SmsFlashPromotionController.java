package com.luban.mall.controller;

import com.luban.mall.domain.FlashPromotionProduct;
import com.luban.mall.domain.FlashPromotionSessionExt;
import com.luban.mall.common.api.CommonResult;
import com.luban.mall.model.SmsFlashPromotionSession;
import com.luban.mall.service.PmsProductService;
import com.luban.mall.service.SmsFlashPromotionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/**
 * @description: 商品详情信息管理
 * @Author: 伯乐
 * @Date: 2019/5/20
 **/
@Api(tags = "SmsFlashPromotionController",description = "秒杀活管理#添加")
@RestController
@RequestMapping("/sms")
public class SmsFlashPromotionController {
    @Autowired
    private SmsFlashPromotionService smsFlashPromotionService;

    @Autowired
    private PmsProductService productService;

    /**
     * 获取当前日期秒杀活动场次
     */
    @ApiOperation(value = "获取当前日期所有活动场次#需要做QPS优化",notes = "示例：10:00场,13:00场")
    @GetMapping("/flashPromotion/getSessionTimeList")
    public CommonResult<List<FlashPromotionSessionExt>> getSessionTimeList() {
        return CommonResult.success(smsFlashPromotionService.getFlashPromotionSessionList());
    }

    @ApiOperation("当前秒杀活动场-产品列表#需要做QPS优化")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "flashPromotionId", value = "秒杀活动ID", required = true, paramType = "query", dataType = "integer"),
            @ApiImplicitParam(name = "flashPromotionSessionId", value = "秒杀活动时间段ID", required = true, paramType = "query", dataType = "integer")})
    @GetMapping("/flashPromotion/getProduct")
    public CommonResult<List<FlashPromotionProduct>> getProduct(
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            //当前秒杀活动主题ID
            @RequestParam(value = "flashPromotionId") Long flashPromotionId,
            //当前秒杀活动场次ID
            @RequestParam(value = "flashPromotionSessionId") Long flashPromotionSessionId){
        return CommonResult.success(productService.getFlashProductList(pageSize,pageNum,flashPromotionId,flashPromotionSessionId));
    }
}
