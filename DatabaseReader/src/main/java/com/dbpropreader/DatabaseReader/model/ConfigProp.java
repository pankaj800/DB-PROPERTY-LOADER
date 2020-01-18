package com.dbpropreader.DatabaseReader.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "config_prop")
public class ConfigProp {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "")
	private int refId;
	@Column(name = "property_name")
	private String propertyName;
	@Column(name = "property_value")
	private String propertyValue;

}
