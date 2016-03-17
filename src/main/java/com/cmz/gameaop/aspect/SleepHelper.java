package com.cmz.gameaop.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
public class SleepHelper {

    
    @Pointcut("execution(public * com.cmz.gameaop.service.*.*(..))")
    public void sleeppoint(){}
    
    @Before("sleeppoint() && args(name,..)")
    public void beforeSleep(String name){
        System.out.println(name+"睡觉前要脱衣服!");
    }
    @Pointcut("within(com.cmz.gameaop.service.*)")
    public void inTrading() {
    	
    	System.out.println("with in");
    }
    @AfterReturning("sleeppoint()")
    public void afterSleep(){
        System.out.println("睡醒了要穿衣服！");
    }
    
    @AfterThrowing("sleeppoint()")
    public void throwException(){
    	System.out.println("异常");
    }
    
}
