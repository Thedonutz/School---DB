package com.umkc.db.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author jm051781
 *
 */
@Entity
@Table(name = "Pokemon")
public class Pokemon implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9101018771025305192L;

	@Id
	@Column(name = "id")
	protected Integer id;

	@Column(name = "pokedex_number")
	protected Integer pokedexNumber;

	@Column(name = "name")
	private String name;

	@Column(name = "caught_by")
	private Integer caughtBy;

	@Column(name = "rarity")
	private String rarity;

	@Column(name = "nature")
	private String nature;

	@Column(name = "sex")
	private char sex;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public Integer getCaughtBy() {
		return caughtBy;
	}

	public void setCaughtBy(Integer caughtBy) {
		this.caughtBy = caughtBy;
	}

	public String getRarity() {
		return rarity;
	}

	public void setRarity(String rarity) {
		this.rarity = rarity;
	}

	public String getNature() {
		return nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}
}
