package com.cmz.gameaop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Service;

@Configuration
@ComponentScan(basePackages="org.example",includeFilters=@Filter(type = FilterType.ANNOTATION, value = Service.class))
public class AppConfig {
	
}
