package com.order.controller;

import com.luban.mall.common.api.CommonResult;
import com.luban.mall.common.exception.BusinessException;
import com.order.domain.OrderDetail;
import com.order.service.PayService;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: 伯乐
 * @Date: 2020/6/11 21:13
 */

@Slf4j
@RestController
@RequestMapping("/order")
public class OrderController {
     @Autowired
     private PayService payService;

    @PostMapping("/genQrCode")
    public CommonResult genQrCode(@RequestBody OrderDetail orderDetail) throws BusinessException {
        String path = payService.genQrCode(orderDetail);
        if(StringUtils.isNotEmpty(path)){
            return  CommonResult.success(path);
        }
        return CommonResult.failed();
    }
}
