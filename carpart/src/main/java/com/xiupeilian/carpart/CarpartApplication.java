package com.xiupeilian.carpart;

import com.xiupeilian.carpart.config.RedisCacheConfig;
import com.xiupeilian.carpart.config.SpringConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
/**
 * @Description: springboot-springmvc-spring-mybatis-mysql-redis cluster-spring session-spring cache-thymeleaf
 *
 * spring.profiles.active=dev
 * springboot在启动之后会加载application.properties/yaml yml
 * 加载完毕之后会扫描spring.profiles.active=dev  ,dev名字
 * 然后spring会去加载 application-名字.properties(yaml yml)
 * @Author:      Administrator
 * @Param:
 * @Return
  **/
@SpringBootApplication
@Import({SpringConfig.class, RedisCacheConfig.class})
public class CarpartApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarpartApplication.class, args);
	}

}
