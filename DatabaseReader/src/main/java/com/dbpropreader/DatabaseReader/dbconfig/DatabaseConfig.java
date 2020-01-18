package com.dbpropreader.DatabaseReader.dbconfig;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfig {

	
	@Bean(name="datasource")
	@ConfigurationProperties(prefix="spring.datasource")
	public DataSource datasoure(){
		return DataSourceBuilder.create().build();
	}
}
