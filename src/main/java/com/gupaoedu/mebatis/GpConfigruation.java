package com.gupaoedu.mebatis;

import java.lang.reflect.Proxy;
import java.util.ResourceBundle;

public class GpConfigruation {


    public static  final ResourceBundle resourceMapping;
    static{
        resourceMapping = ResourceBundle.getBundle("mesql");
    }
    /**
     * 使用jdk动态代理返回一个代理对象
     * @param clazz
     * @param <T>
     * @return
     */
    public <T> T getMapper(Class clazz,GpSqlSession sqlSession) {
        return (T) Proxy.newProxyInstance(this.getClass().getClassLoader(),
                new Class[]{clazz},new GpMapperProxy(sqlSession));
    }
}
