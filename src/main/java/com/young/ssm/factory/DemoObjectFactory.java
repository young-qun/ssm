package com.young.ssm.factory;

import org.apache.ibatis.reflection.factory.DefaultObjectFactory;

import java.util.List;
import java.util.Properties;

/**
 * @Auther:dep
 * @Date: 2019/7/17 10:23
 * @Description: 如果想要覆盖默认的对象工厂的属性，可以写一个覆盖默认工厂
 */
public class DemoObjectFactory extends DefaultObjectFactory {
    @Override
    public <T> T create(Class<T> type) {
        return super.create(type);
    }

    @Override
    public <T> T create(Class<T> type, List<Class<?>> constructorArgTypes, List<Object> constructorArgs) {
        return super.create(type, constructorArgTypes, constructorArgs);
    }

    @Override
    public void setProperties(Properties properties) {
        super.setProperties(properties);
    }

    @Override
    protected Class<?> resolveInterface(Class<?> type) {
        return super.resolveInterface(type);
    }

    @Override
    public <T> boolean isCollection(Class<T> type) {
        return super.isCollection(type);
    }
}
