package com.dbpropreader.DatabaseReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dbpropreader.DatabaseReader.repository.ConfigPropRepo;


@SpringBootApplication
public class DatabaseReaderApplication {

	
	
	public static void main(String[] args) {
		
		
		SpringApplication.run(DatabaseReaderApplication.class, args);
	}

}
