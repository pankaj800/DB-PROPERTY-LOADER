package com.dbpropreader.DatabaseReader.utils;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class CustomProperties extends Properties {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomProperties(DataSource dataSource){
		super();
		System.out.println("dataSource+++==== "+dataSource);
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		 List<Map<String, Object>> configs = jdbcTemplate
		 .queryForList("select property_name, property_value from config_prop");
		 
		
		 for (Map<String, Object> config : configs) {
		 setProperty((config.get("property_name")).toString(), (config.get("property_value")).toString());
		 
		 }
	}
}
