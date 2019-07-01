package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Evenement implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nom;
	private Date DateSortie;
	private String Description;
	private double note;
	private String photo;
	public Evenement(int id, String nom, Date dateSortie, String description, double note, String photo) {
		super();
		this.id = id;
		this.nom = nom;
		DateSortie = dateSortie;
		Description = description;
		this.note = note;
		this.photo = photo;
	}
	public Evenement() {
	
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
	 
	@ManyToOne
	private Catégories catégorie;
	
	@OneToMany
	private List<Genre> genres = new ArrayList<Genre>();
	
	
	
	
}