package entities;

import java.io.Serializable;

import javax.persistence.ManyToOne;

public class Genre implements Serializable {

	private int id;
	private String Description;
	public Genre(int id, String description) {
		super();
		this.id = id;
		Description = description;
	}
	public Genre() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
	
	@ManyToOne
	private Evenement event;
	
}
