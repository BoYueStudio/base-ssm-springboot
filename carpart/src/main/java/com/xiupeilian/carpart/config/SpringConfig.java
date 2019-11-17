package com.xiupeilian.carpart.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Description:ssm整合的配置类
 * @Author: Tu Xu
 * @CreateDate: 2019/9/3 9:53
 * @Version: 1.0
 **/
@Configuration
@MapperScan("com.xiupeilian.carpart.mapper")
@EnableTransactionManagement
@ComponentScan("com.xiupeilian")
@EnableCaching
public class SpringConfig {
}
