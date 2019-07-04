package com.example.cinema.services;

import java.util.List;

import com.example.cinema.entities.*;

public interface ICategoriesService {
	public Catégories addCategorie(Catégories c);
	public Catégories getCatégoriesByID(int id );
	public void delete(int id);
	public List<Catégories> findAll();


}

