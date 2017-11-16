package com.umkc.db.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umkc.db.models.PokeDex;

/**
 * 
 * @author jm051781
 *
 */
@Transactional
@Repository
public interface PokedexRepo extends JpaRepository<PokeDex, Integer>{

}
