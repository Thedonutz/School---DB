package com.umkc.db.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "types")
public class PokemonType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 459930723168827759L;

	@Id
	@Column(name = "type_id")
	private Integer typeId;
	
	@Column(name = "name")
	private String name;

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
