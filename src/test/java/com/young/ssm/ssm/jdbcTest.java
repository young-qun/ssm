package com.young.ssm.ssm;

import com.github.pagehelper.PageHelper;
import com.young.ssm.dao.UserDao;
import com.young.ssm.entity.User;
import org.apache.ibatis.executor.result.DefaultResultHandler;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @Auther:dep
 * @Date: 2019/7/15 16:44
 * @Description:
 */
public class jdbcTest {

    @Test
    public  void  test1(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection =  DriverManager.getConnection("","","");
            String sql = "";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                resultSet.getString("");
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test2(){
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession(false);
            //使用分也助手
            PageHelper pageHelper = new PageHelper();
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            userDao.selectUserAndDepart(1l,1);
            sqlSession.select("",new  DefaultResultHandler());
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
