package com.example.config;

/**
 * Copyright 2004-2020 by xdja.com  All rights reserved.
 *
 * @author lw
 * @version 1.0.0
 * @ClassName MybatisPlusConfig.java
 * @Description TODO
 * @createTime 2022/05/12 11:00:17
 */
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置分页插件
 *
 */
@Configuration
public class MybatisPlusConfig {

	/**
	 * 分页插件
	 */
	@Bean
	public PaginationInterceptor paginationInterceptor() {
		return new PaginationInterceptor();
	}
}