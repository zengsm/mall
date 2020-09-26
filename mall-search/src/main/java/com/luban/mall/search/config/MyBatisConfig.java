package com.luban.mall.search.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * @Author: 伯乐
 * @Date: 2019/5/21
 */
@Configuration
@MapperScan({"com.luban.mall.mapper","com.luban.mall.search.dao"})
public class MyBatisConfig {
}
