package com.young.ssm.ssm;

import com.young.ssm.dao.UserDao;
import com.young.ssm.event.DemoEvent;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.jdbc.datasource.DelegatingDataSource;

import javax.sql.DataSource;
import java.io.IOException;
import java.security.PublicKey;
import java.util.Locale;

@SpringBootApplication
@Import(webMvcConfiguration.class)
public class SsmApplication {



	@Bean("messageSource")
	public MessageSource getMessageSource(){
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setDefaultEncoding("utf-8");
		messageSource.setCacheSeconds(10);
		messageSource.setBasenames("i18n/message");
		messageSource.setFallbackToSystemLocale(true);//指定语言找不到时，使用默认环境
		return  messageSource;
	}

	/**
	 * mybatis 整合spring
	 * @param args
	 */
	@Bean
	public SqlSessionFactory getSqlSessionFactory(){
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource());
//		sqlSessionFactoryBean.setMapperLocations();
		return sqlSessionFactoryBean.getObject();
	}

	@Bean
	public DataSource dataSource() {
		DataSource dataSource = new DelegatingDataSource();
		return dataSource;
	}

	/**
	 * 配置mapper
	 * @return
	 */
	@Bean
	public UserDao getUserDao(){
		SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(getSqlSessionFactory());
		return sqlSessionTemplate.getMapper(UserDao.class);
	}


	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SsmApplication.class, args);
		MessageSource messageSource = (MessageSource) context.getBean("messageSource");
		System.out.println(messageSource.getMessage("home",args, Locale.SIMPLIFIED_CHINESE));

		context.publishEvent(new DemoEvent(new Object(),"lisi","25"));
	}
}
