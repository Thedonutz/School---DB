package com.umkc.db.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gym_members")
public class GymMembers implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3007247752454567215L;

	@Id
	@Column(name = "gym_name")
	private String gymName;
	
	@Column(name = "trainerid")
	private Integer trainerId;

	public String getGymName() {
		return gymName;
	}

	public void setGymName(String gymName) {
		this.gymName = gymName;
	}

	public Integer getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(Integer trainerId) {
		this.trainerId = trainerId;
	}
	
}
