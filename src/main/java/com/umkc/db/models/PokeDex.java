package com.umkc.db.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pokedex_global")
public class PokeDex implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2095584527395022669L;

	@Id
	@Column(name = "pokedex_number")
	private Integer pokedexNumber;
	
	@Column(name = "name")
	private String name;

	public Integer getPokedexNumber() {
		return pokedexNumber;
	}

	public void setPokedexNumber(Integer pokedexNumber) {
		this.pokedexNumber = pokedexNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
