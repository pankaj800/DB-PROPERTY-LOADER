package com.dbpropreader.DatabaseReader.repository;

import org.springframework.data.repository.CrudRepository;

import com.dbpropreader.DatabaseReader.model.ConfigProp;

public interface ConfigPropRepo extends CrudRepository<ConfigProp, Integer>{

	public String getPropertyValueByPropertyName(String  propertyName);
}
