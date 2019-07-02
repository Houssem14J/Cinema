package com.example.cinema.entities;

import java.io.Serializable;
import java.util.ArrayList;
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

@Entity
public class Salle implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO )
	private Integer Id;
	
	private Integer num;
	private String nom;
	private Integer capacite;
	private String local;
	
	
	
	public Salle() {}
	
	@OneToMany(mappedBy="salle", fetch=FetchType.EAGER,cascade=CascadeType.ALL)
    private List<SalleEvent> salleevent = new ArrayList<>();



	public Salle(Integer id, Integer num, String nom, Integer capacite, String local, List<SalleEvent> salleevent) {
		super();
		Id = id;
		this.num = num;
		this.nom = nom;
		this.capacite = capacite;
		this.local = local;
		this.salleevent = salleevent;
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

	public Integer getCapacite() {
		return capacite;
	}

	public void setCapacite(Integer capacite) {
		this.capacite = capacite;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public List<SalleEvent> getSalleevent() {
		return salleevent;
	}

	public void setSalleevent(List<SalleEvent> salleevent) {
		this.salleevent = salleevent;
	}
	
}