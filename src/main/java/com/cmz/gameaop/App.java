package com.cmz.gameaop;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.cmz.gameaop.service.Human;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new FileSystemXmlApplicationContext("conf/spring.xml");
        //Sleepable person = (Sleepable)context.getBean("human");
        Sleepable person = (Sleepable)context.getBean("human1");
 
        //AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(String.class);
        MyBean myBean = (MyBean)context.getBean("myBean");
        myBean.setI(10);
        myBean.test("abd");
        MyBean myBean1 = (MyBean)context.getBean("myBean");
        System.out.println(myBean1.getI());
        
        System.out.println(context.getMessage("name", null, "Default", null));
       
        BeanWrapper wrapper = new BeanWrapperImpl();
        try {
			person.sleep("pig");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
