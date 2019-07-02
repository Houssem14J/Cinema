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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ReservationTicket implements Serializable {
	
	@EmbeddedId
	private reservationticketPK reservationticketPK;
	
	@Temporal(TemporalType.DATE)
	private Date datereservation;
	
	@ManyToOne
    @JoinColumn(name = "evenement_id", referencedColumnName = "id", insertable=false, updatable=false)
	private Evenement evenement;
	
	@ManyToOne
    @JoinColumn(name = "client_id", referencedColumnName = "id", insertable=false, updatable=false)
	private Client client;

}