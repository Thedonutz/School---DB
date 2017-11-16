package com.umkc.db.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Pokemon_Evolved_From")
public class Evolved implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9145995069546904100L;

	@Id
	@Column(name = "basepokedex_number")
	private Integer pokedexNumber;
	
	@Column(name = "evolved_from_pokedex_number")
	private Integer evolvedFrom;

	public Integer getPokedexNumber() {
		return pokedexNumber;
	}

	public void setPokedexNumber(Integer pokedexNumber) {
		this.pokedexNumber = pokedexNumber;
	}

	public Integer getEvolvedFrom() {
		return evolvedFrom;
	}

	public void setEvolvedFrom(Integer evolvedFrom) {
		this.evolvedFrom = evolvedFrom;
	}

}
