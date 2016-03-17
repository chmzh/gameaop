package com.cmz.gameaop.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import com.cmz.gameaop.Sleepable;


/**
 * 
 * 当xml中配置<context:component-scan base-package="com.cmz.gameaop.service" use-default-filters="false">
		<context:include-filter type="annotation" expression="org.springframework.stereotype.Service"/> 
	</context:component-scan> 
	<bean class="com.cmz.gameaop.aspect.SleepHelper"></bean>
	
	<aop:aspectj-autoproxy />
 * 
 * 实现自定义接口会出现  No qualifying bean of type
 * 
 * 
 * 
 * @author mingzhou.chen
 * 28458942@qq.com
 * 2015年6月8日 下午5:47:44
 */
@Service
public class Human implements ApplicationContextAware,Sleepable {

	public void sleep(String name) throws Exception {
		System.out.println("睡觉");
		throw new Exception("睡觉");
	}

	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		// TODO Auto-generated method stub
		
	}

	
	
}
