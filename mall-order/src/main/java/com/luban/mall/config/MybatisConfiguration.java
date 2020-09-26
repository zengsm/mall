package com.luban.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement //开启事务
@MapperScan(basePackages = {"com.macro.mall.mapper"})
public class MybatisConfiguration {
}
