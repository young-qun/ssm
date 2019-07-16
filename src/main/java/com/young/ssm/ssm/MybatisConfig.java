package com.young.ssm.ssm;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @Auther:dep
 * @Date: 2019/7/16 16:18
 * @Description: Mybatis 的配置文件
 */
@Configuration
public class MybatisConfig {

    @Bean
    public SqlSessionFactoryBuilder getSqlSessionFactoryBuilder(){
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        return  sqlSessionFactoryBuilder;
    }

    @Bean
    public SqlSessionFactory getSqlSessionFactory(SqlSessionFactoryBuilder sqlSessionFactoryBuilder){
        SqlSessionFactory sqlSessionFactory = null;
        try {
            InputStream inputStream = new FileInputStream("classpath:mybatis-config.xml");
            sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return sqlSessionFactory;
    }

    @Bean
    public SqlSession getSqlSession(SqlSessionFactory sqlSessionFactory){
        SqlSession sqlSession = sqlSessionFactory.openSession(false);
        return sqlSession;
    }
}
