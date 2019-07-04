package com.example.cinema.entities;

import java.io.Serializable;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ReservationTicket implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Temporal(TemporalType.DATE)
	private Date datereservation;
	
	@ManyToOne
	private Evenement evenements;
	
	@ManyToOne
	private Client client;

	public ReservationTicket(int id, Date datereservation, Evenement evenement, Client client) {
		super();
		this.id = id;
		this.datereservation = datereservation;
		this.evenements = evenement;
		this.client = client;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDatereservation() {
		return datereservation;
	}

	public void setDatereservation(Date datereservation) {
		this.datereservation = datereservation;
	}

	public Evenement getEvenement() {
		return evenements;
	}

	public void setEvenement(Evenement evenement) {
		this.evenements = evenement;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	
}