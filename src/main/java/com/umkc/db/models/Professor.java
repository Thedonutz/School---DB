package com.umkc.db.models;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "professor")
public class Professor implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8152818062646199587L;

	@Id
	@Column(name = "professorid")
	private Integer professorId;
	
	@Column(name = "firstname")
	private String firstName;
	
	@Column(name = "lastname")
	private String lastName;
	
	@Column(name = "birthdate")
	private Date birthDate;
	
	@Column(name = "sex")
	private char sex;
	
	@Column(name = "professor_induction_date")
	private Date professorInductionDate;
	
	@Column(name = "oversees_city")
	private String overseesCity;

	public Integer getProfessorId() {
		return professorId;
	}

	public void setProfessorId(Integer professorId) {
		this.professorId = professorId;
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

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public Date getProfessorInductionDate() {
		return professorInductionDate;
	}

	public void setProfessorInductionDate(Date professorInductionDate) {
		this.professorInductionDate = professorInductionDate;
	}

	public String getOverseesCity() {
		return overseesCity;
	}

	public void setOverseesCity(String overseesCity) {
		this.overseesCity = overseesCity;
	}
	
}
