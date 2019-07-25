package com.young.ssm.dao;

import com.young.ssm.entity.User;
import tk.mybatis.mapper.common.Mapper;

/**
 * @Auther:dep
 * @Date: 2019/7/18 15:44
 * @Description: userDao的查询
 */
public interface UserDao extends Mapper<User> {

    public User selectUserAndDepart(Long id,Integer status);

    public void inertOne(User user);

    public void updateOne(String name,Long id);

    public  void deleteOne(Long id);
}
