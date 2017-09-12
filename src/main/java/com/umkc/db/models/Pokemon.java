package com.umkc.db.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * 
 * @author jm051781
 *
 */
@Entity
@Table(name = "Pokemon")
@Inheritance(strategy = InheritanceType.JOINED)
public class Pokemon {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;

	@Column(name = "pokedex_id")
	protected String pokedexId;

}
