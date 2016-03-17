package com.cmz.gameaop;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class MyMethodReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("替换方法:"+args[0]);
		return null;
	}

}
