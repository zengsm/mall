package com.order.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ResourceConfig implements WebMvcConfigurer {
    @Autowired
    private PayConfig payConfig;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        String os = System.getProperty("os.name");
        if(os.toLowerCase().startsWith("win")){ //windows系统
            /** 支付码图片QrCode图片存储路径 */
            registry.addResourceHandler(payConfig.getHttpResourcePath()
                    +"/**")
                    .addResourceLocations("file:" + payConfig.getQrBasePath() + "/");
        }else{ //linux或者mac
            registry.addResourceHandler("/static/resources/**")
                    .addResourceLocations("file:/usr/local/resources/"); //静态资源
                    //.addResourceLocations("classpath:/META-INF/resources/"); //swagger2页面
        }
    }

}
