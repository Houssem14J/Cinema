package com.example.cinema.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class reservationticketPK implements Serializable{
	
	private Integer client_id;
	private Integer evenement_id;
	
	public reservationticketPK() {
		super();
	}


	public reservationticketPK(Integer client_id, Integer evenement_id) {
		super();
		this.client_id = client_id;
		this.evenement_id = evenement_id;	
	}

	public Integer getClient_id() {
		return client_id;
	}


	public void setClient_id(Integer client_id) {
		this.client_id = client_id;
	}


	public Integer getEvenement_id() {
		return evenement_id;
	}


	public void setEvenement_id(Integer evenement_id) {
		this.evenement_id = evenement_id;
	}

}