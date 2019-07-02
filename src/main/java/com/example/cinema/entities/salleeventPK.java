package com.example.cinema.entities;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class salleeventPK implements Serializable {
	
	private Integer salle_id;
	private Integer evenement_id;
	

	
	public salleeventPK() {
		super();
	}

	public salleeventPK(Integer salle_id, Integer evenement_id) {
		super();
		this.salle_id = salle_id;
		this.evenement_id = evenement_id;

	}

	public Integer getSalle_id() {
		return salle_id;
	}

	public void setSalle_id(Integer salle_id) {
		this.salle_id = salle_id;
	}

	public Integer getEvenement_id() {
		return evenement_id;
	}

	public void setEvenement_id(Integer evenement_id) {
		this.evenement_id = evenement_id;
	}
	
}