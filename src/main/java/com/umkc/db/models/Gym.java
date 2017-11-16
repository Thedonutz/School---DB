package com.umkc.db.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="gym")
public class Gym implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7789936713734964975L;

	@Id
	@Column(name = "gym_name")
	private String gymName;
	
	@Column(name = "leaderid")
	private Integer leaderId;
	
	@Column(name = "gym_type")
	private Integer gymType;
	
	@Column(name = "cityname")
	private String cityName;

	public String getGymName() {
		return gymName;
	}

	public void setGymName(String gymName) {
		this.gymName = gymName;
	}

	public Integer getLeaderId() {
		return leaderId;
	}

	public void setLeaderId(Integer leaderId) {
		this.leaderId = leaderId;
	}

	public Integer getGymType() {
		return gymType;
	}

	public void setGymType(Integer gymType) {
		this.gymType = gymType;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

}