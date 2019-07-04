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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client implements Serializable {
	
	@Id
	@GeneratedValue( strategy= GenerationType.AUTO)
	private Integer Id;
	
	private Integer num;
	private String nom;
	private String prenom;
	private String adresse;
	private String email;
	private String photo;
	private String profession;
	private Date date_naissance;
	private String password;
	private String username;
	
	
	@OneToMany(mappedBy="client", fetch=FetchType.EAGER,cascade=CascadeType.ALL)
    private List<ReservationTicket> reservationticket = new ArrayList<>();
	
	
	public Client() {}

	public Client(Integer id, Integer num, String nom, String prenom, String adresse, String email, String photo,
			String profession, Date date_naissance, String password, String username,List<ReservationTicket> reservationticket) {
		super();
		Id = id;
		this.num = num;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.email = email;
		this.photo = photo;
		this.profession = profession;
		this.date_naissance = date_naissance;
		this.password = password;
		this.username=username;
		this.reservationticket = reservationticket;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public Date getDate_naissance() {
		return date_naissance;
	}

	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<ReservationTicket> getReservationticket() {
		return reservationticket;
	}

	public void setReservationticket(List<ReservationTicket> reservationticket) {
		this.reservationticket = reservationticket;
	}

	
}