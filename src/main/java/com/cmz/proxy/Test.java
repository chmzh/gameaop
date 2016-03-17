package com.cmz.proxy;

import java.lang.reflect.Proxy;

public class Test {
	public static void main(String[] args) {
		UserDAO userDAO = new UserDAOImpl();
		LogInterceptor li = new LogInterceptor();  //创建一个Handerler对象
        li.setTarget(userDAO);   //将Handler对象和被代理对象关联
        /*newProxyInstance参数含义
         * 第一个参数：代理的类加载器，必须和被代理的对象是一个类加载器
         * 第二个参数含义:代理对象要实现的那些接口
         * 第三个参数：指派方法调用的调用处理程序
         * */
        UserDAO userDAOProxy = (UserDAO)Proxy.newProxyInstance(userDAO.getClass().getClassLoader(), userDAO.getClass().getInterfaces(), li);
        System.out.println(userDAO.getClass().getInterfaces().getClass());
        System.out.println(userDAOProxy.getClass().getInterfaces()[0]);
        userDAOProxy.delete();
        userDAOProxy.save();
	}
}
