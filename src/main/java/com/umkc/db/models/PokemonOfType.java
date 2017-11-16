package com.umkc.db.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pokemon_of_type")
public class PokemonOfType implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7847007304476019081L;

	@Id
	@Column(name = "pokedex_number")
	private Integer pokedexNumber;
	
	@Column(name = "type_id")
	private Integer typeId;

	public Integer getPokedexNumber() {
		return pokedexNumber;
	}

	public void setPokedexNumber(Integer pokedexNumber) {
		this.pokedexNumber = pokedexNumber;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

}
