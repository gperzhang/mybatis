package com.gupaoedu.mebatis;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GpMapperProxy implements InvocationHandler {

    //通过构造方法拿到被代理对象的引用
    private GpSqlSession sqlSession;
    public GpMapperProxy(GpSqlSession sqlSession){
        this.sqlSession = sqlSession;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        String statementId = method.getDeclaringClass().getName()+"."+method.getName();
        return sqlSession.selectOne(statementId,args[0]);
    }
}
