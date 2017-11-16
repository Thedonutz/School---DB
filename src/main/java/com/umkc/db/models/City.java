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
@Table(name = "City")
public class City implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3038577711534701999L;

	@Id
	@Column(name = "cityname")
	private String cityName;
	
	//@Id
	@Column(name = "regionname")
	private String regionName;

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

}
