package com.dbpropreader.DatabaseReader.controller;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbpropreader.DatabaseReader.utils.CustomProperties;

@RestController
@RequestMapping("/dbread")
public class DBReadController {
	/*@Autowired
	PropertyUtils propertyUtils;*/
	@Autowired
	DataSource dataSource;
	@GetMapping("/value/{key}")
	public String getValue(@PathVariable("key")String key){
		CustomProperties customProperties=new CustomProperties(dataSource);
		//return propertyUtils.getProperty(key);
		String data=customProperties.getProperty("key");
		System.out.println(data);
		return "hello";
	}

}
