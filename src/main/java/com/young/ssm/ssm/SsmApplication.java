package com.young.ssm.ssm;

import com.young.ssm.event.DemoEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;

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

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SsmApplication.class, args);
		MessageSource messageSource = (MessageSource) context.getBean("messageSource");
		System.out.println(messageSource.getMessage("home",args, Locale.SIMPLIFIED_CHINESE));

		context.publishEvent(new DemoEvent(new Object(),"lisi","25"));
	}
}
