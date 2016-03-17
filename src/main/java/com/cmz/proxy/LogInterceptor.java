package com.cmz.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogInterceptor implements InvocationHandler {
	 private Object target;   //被代理的对象
     
     public Object getTarget() {
             return target;
     }

     public void setTarget(Object target) {
             this.target = target;
     }
	
	
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		//before
		System.out.println("before "+method.getName());
		//run
		method.invoke(target, args);
		//after
		System.out.println("after"+method.getName());
		return null;
	}

}
