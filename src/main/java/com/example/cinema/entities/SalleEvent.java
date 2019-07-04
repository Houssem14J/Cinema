package com.example.cinema.entities;

import java.io.Serializable;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class SalleEvent implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Temporal(TemporalType.DATE)
	private Date datedifussion;
	
	private Time heuredebut;	
	
	@ManyToOne
    @JoinColumn(name = "salle_id", referencedColumnName = "id")
	private Salle salle;
	
	@ManyToOne
    @JoinColumn(name = "evenement_id", referencedColumnName = "id")
	private Evenement evenement;

	public SalleEvent(int id, Date datedifussion, Time heuredebut, Salle salle, Evenement evenement) {
		super();
		this.id = id;
		this.datedifussion = datedifussion;
		this.heuredebut = heuredebut;
		this.salle = salle;
		this.evenement = evenement;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDatedifussion() {
		return datedifussion;
	}

	public void setDatedifussion(Date datedifussion) {
		this.datedifussion = datedifussion;
	}

	public Time getHeuredebut() {
		return heuredebut;
	}

	public void setHeuredebut(Time heuredebut) {
		this.heuredebut = heuredebut;
	}

	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	public Evenement getEvenement() {
		return evenement;
	}

	public void setEvenement(Evenement evenement) {
		this.evenement = evenement;
	}
	
	
	
}