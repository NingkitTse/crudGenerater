package com.xnj.multidatasource;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;

import lombok.Data;

/**
 * SqlSessionFactory不要使用原生的，请使用MybatisSqlSessionFactory， 很重要！！
 * 
 * @author NingkitTse
 * @date 2020年1月5日
 */
@Configuration
@EnableTransactionManagement
@Data
public class MyBatisPlusConfig implements ApplicationContextAware {

	private ApplicationContext applicationContext;

	@Bean
	public PaginationInterceptor paginationInterceptor() {
		return new PaginationInterceptor();
	}

	@Bean
	public MapperScannerConfigurer mapperScannerConfigurer() {
		MapperScannerConfigurer scannerConfigurer = new MapperScannerConfigurer();
		// 可以通过环境变量获取你的mapper路径,这样mapper扫描可以通过配置文件配置了
		scannerConfigurer.setBasePackage("com.xnj.multidatasource.mapper");
		return scannerConfigurer;
	}

	@Bean("sqlSessionFactory")
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		MybatisSqlSessionFactoryBean sqlSessionFactory = new MybatisSqlSessionFactoryBean();
		sqlSessionFactory.setDataSource(applicationContext.getBean(DataSource.class));
		sqlSessionFactory.setPlugins(paginationInterceptor());
		return sqlSessionFactory.getObject();
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
}
