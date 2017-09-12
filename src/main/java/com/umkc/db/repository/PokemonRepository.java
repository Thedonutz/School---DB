package com.umkc.db.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umkc.db.models.Pokemon;

/**
 * 
 * @author jm051781
 *
 */
@Transactional
@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Long>{

	List<Pokemon> findAll();

}
