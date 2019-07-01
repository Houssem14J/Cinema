package services;

import entities.Catégories;

public interface ICategoriesService {
	public Catégories addCategorie(Catégories c);
	public Catégories getCatégoriesByID(int id );
	public void delete(int id);

}

