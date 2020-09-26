package com.luban.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis配置类
 * @Author: 伯乐
 * @Date: 2019/5/20
 **/
@Configuration
@EnableTransactionManagement
@MapperScan({"com.luban.mall.mapper","com.luban.mall.dao"})
public class MyBatisConfig {
}
