package com.dbpropreader.DatabaseReader.utils;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PropertyUtils2 implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException 
	{
	System.out.println("In After bean Initialization method. Bean name is "+beanName);
	return bean;
	}
}
