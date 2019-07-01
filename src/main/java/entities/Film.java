package entities;

import java.util.Date;

public class Film extends Evenement {

	private int id;
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
		id = id2;
		this.libellé = libellé;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibellé() {
		return libellé;
	}

	public void setLibellé(String libellé) {
		this.libellé = libellé;
	}
	
	
	
}
