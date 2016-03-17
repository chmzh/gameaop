package com.cmz.gameaop;

import java.beans.Introspector;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.util.ClassUtils;

public class MyBeanNameGenertor implements BeanNameGenerator {

	@Override
	public String generateBeanName(BeanDefinition definition,
			BeanDefinitionRegistry registry) {
		// TODO Auto-generated method stub
		String name = ClassUtils.getShortName(definition.getBeanClassName());
		
		return Introspector.decapitalize(name);
	}

}
