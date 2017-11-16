package com.umkc.db.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umkc.db.models.City;

/**
 * 
 * @author jm051781
 *
 */
@Transactional
@Repository
public interface CityRepo extends JpaRepository<City, String> {

}
