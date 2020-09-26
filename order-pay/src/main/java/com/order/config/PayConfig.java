package com.order.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: 伯乐
 * @Date: 2020/6/11 20:42
 */
@Component
@ConfigurationProperties(prefix = "pay.qrcode")
@Data
public class PayConfig {
    //支付宝二维码存储路径
    private String alipayPath;
    //二维码存储根路径
    private String qrBasePath;
    //http访问路径设置
    private String httpResourcePath;
    //支付成功回调
    private String paySucCallBach;

}
