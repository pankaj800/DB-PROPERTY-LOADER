package com.dbpropreader.DatabaseReader.dbconfig;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dbpropreader.DatabaseReader.utils.PropertyUtils;

@Configuration
public class DatabaseConfig {

	
	@Bean(name="datasource")
	public DataSource datasoure(){
		
		return DataSourceBuilder.create().url("jdbc:mysql://localhost:3306/imessanger").driverClassName("com.mysql.cj.jdbc.Driver").username("root").password("tiger").build();
		
	}
	
	@Bean
	public PropertyUtils propertyUtils(){
		PropertyUtils propertyUtils=new PropertyUtils();
		propertyUtils.setDataSourceName("datasource");
		propertyUtils.setLocalOverride(true);
		
		return propertyUtils;
	}
}
