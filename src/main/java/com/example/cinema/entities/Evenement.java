package com.example.cinema.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class Evenement implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	
	private String nom;
	private Date DateSortie;
	private String Description;
	private double note;
	private String photo;
	private String type;
	private Integer  duree;
	private String editeur;

	public Evenement() {
	
	}

	@ManyToOne
	private Catégories catégorie;
	
	@OneToMany(mappedBy="event", cascade = CascadeType.PERSIST )
	private List<Genre> genres = new ArrayList<Genre>();
	
	@OneToMany(mappedBy="evenements", cascade = CascadeType.PERSIST )
	private List<ReservationTicket> reservationticket = new ArrayList<ReservationTicket>();
	
	@OneToMany(mappedBy="evenement", cascade = CascadeType.PERSIST )
	private List<SalleEvent> salleevent = new ArrayList<SalleEvent>();

	public Evenement(int id, String nom, Date dateSortie, String description, double note, String photo, String type,
			Integer duree, String editeur, Catégories catégorie, List<Genre> genres,
			List<ReservationTicket> reservationticket, List<SalleEvent> salleevent) {
		super();
		this.id = id;
		this.nom = nom;
		DateSortie = dateSortie;
		Description = description;
		this.note = note;
		this.photo = photo;
		this.type = type;
		this.duree = duree;
		this.editeur = editeur;
		this.catégorie = catégorie;
		this.genres = genres;
		this.reservationticket = reservationticket;
		this.salleevent = salleevent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getDateSortie() {
		return DateSortie;
	}

	public void setDateSortie(Date dateSortie) {
		DateSortie = dateSortie;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public double getNote() {
		return note;
	}

	public void setNote(double note) {
		this.note = note;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getDuree() {
		return duree;
	}

	public void setDuree(Integer duree) {
		this.duree = duree;
	}

	public String getEditeur() {
		return editeur;
	}

	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	public Catégories getCatégorie() {
		return catégorie;
	}

	public void setCatégorie(Catégories catégorie) {
		this.catégorie = catégorie;
	}

	public List<Genre> getGenres() {
		return genres;
	}

	public void setGenres(List<Genre> genres) {
		this.genres = genres;
	}

	public List<ReservationTicket> getReservationticket() {
		return reservationticket;
	}

	public void setReservationticket(List<ReservationTicket> reservationticket) {
		this.reservationticket = reservationticket;
	}

	public List<SalleEvent> getSalleevent() {
		return salleevent;
	}

	public void setSalleevent(List<SalleEvent> salleevent) {
		this.salleevent = salleevent;
	}	
	
	
	
}
