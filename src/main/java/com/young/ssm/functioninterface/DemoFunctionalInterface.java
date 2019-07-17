package com.young.ssm.functioninterface;

/**
 * @Auther:dep
 * @Date: 2019/7/17 14:22
 * @Description: 对于函数式的接口只要里面有一个抽象方法接口
 */
@FunctionalInterface
public interface DemoFunctionalInterface<T> {
    /**
     * 获取值的方法
     * @param t
     * @return
     */
    public  abstract  T  getValue(T t);

    /**
     * jdk8 以后接口中允许存在static default修饰的非抽象方法
     */
    public default   void getName1(){
        System.out.println("young ");
    }
    public static    void getName2(){
        System.out.println("young ");
    }
}
