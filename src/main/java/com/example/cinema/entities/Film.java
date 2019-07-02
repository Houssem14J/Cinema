package com.example.cinema.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Film extends Evenement implements Serializable {

	
	
	private String libellé;
	
	public Film() {
		super();
		
	}
	
	public Film(int id, String nom, Date dateSortie, String description, double note, String photo) {
		super(id, nom, dateSortie, description, note, photo);
		
	}

	public Film(int id, String nom, Date dateSortie, String description, double note, String photo, int id2,
			String libellé) {
		super(id, nom, dateSortie, description, note, photo);

		this.libellé = libellé;
	}

	
	public String getLibellé() {
		return libellé;
	}

	public void setLibellé(String libellé) {
		this.libellé = libellé;
	}
	
	
	
}
