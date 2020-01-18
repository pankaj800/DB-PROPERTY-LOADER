/*package com.dbpropreader.DatabaseReader.utils;

import java.io.IOException;
import java.io.Serializable;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.stereotype.Component;

@Component
public class PropertyUtils extends PropertyPlaceholderConfigurer implements Serializable{

	*//**
	 * 
	 *//*
	private static final long serialVersionUID = 1L;
	
	private  CustomProperties customProps;
	
	public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory){

for(String benName:configurableListableBeanFactory.getBeanDefinitionNames()){
	System.out.println(benName);
}
		DataSource dataSource = (DataSource) configurableListableBeanFactory.getBean("datasource");
		customProps=new CustomProperties(dataSource);
		setProperties(customProps);
		super.postProcessBeanFactory(configurableListableBeanFactory);
		
	}
	public  String getProperty(String name) {
		return (null == customProps.get(name)) ? "" : customProps.get(name).toString();
	}
}
*/