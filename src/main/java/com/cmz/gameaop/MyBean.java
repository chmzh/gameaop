package com.cmz.gameaop;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;

@Scope
public class MyBean {
	private int i;
	@Value("#{ systemProperties['user.region'] }")
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
	public void test(String name){
		System.out.println("原始方法:"+name);
	}
}
