package com.umkc.db.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pokemon_origin")
public class PokemonOrigin implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 486184184738158370L;

	@Id
	@Column(name = "pokedex_number")
	private Integer pokedexNumber;
	
	@Column(name = "regionname")
	private String regionName;

	public Integer getPokedexNumber() {
		return pokedexNumber;
	}

	public void setPokedexNumber(Integer pokedexNumber) {
		this.pokedexNumber = pokedexNumber;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	
}
