package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

public class Catégories implements Serializable {
	
	private int id;
	private String description;
	private int prix ;
	public Catégories(int id, String description, int prix) {
		super();
		this.id = id;
		this.description = description;
		this.prix = prix;
	}
	public Catégories() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	
	
	@OneToMany(mappedBy="categories",fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	private List<Evenement> events = new ArrayList<>();
	
	

}
