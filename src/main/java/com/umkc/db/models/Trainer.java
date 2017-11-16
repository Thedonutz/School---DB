package com.umkc.db.models;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trainer")
public class Trainer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7721381793854426191L;

	@Id
	@Column(name = "trainerid")
	private Integer trainerId;
	
	@Column(name = "firstname")
	private String firstName;
	
	@Column(name = "lastname")
	private String lastName;
	
	@Column(name = "birthdate")
	private Date birthDate;
	
	@Column(name = "city_from")
	private String cityFrom;
	
	@Column(name = "advised_by")
	private Integer advisedBy;
	
	@Column(name = "sex")
	private char sex;

	public Integer getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(Integer trainerId) {
		this.trainerId = trainerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getCityFrom() {
		return cityFrom;
	}

	public void setCityFrom(String cityFrom) {
		this.cityFrom = cityFrom;
	}

	public Integer getAdvisedBy() {
		return advisedBy;
	}

	public void setAdvisedBy(Integer advisedBy) {
		this.advisedBy = advisedBy;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}
	
}
