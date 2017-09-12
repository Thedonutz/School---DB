package com.umkc.db.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.umkc.db.models.Pokemon;

/**
 * 
 * @author jm051781
 *
 */
@Transactional
public interface PokemonRepository extends JpaRepository<Pokemon, Long>{

	List<Pokemon> findAll();

}
