package com.umkc.db.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="natures")
public class Nature implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1705296150942850604L;

	@Id
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
