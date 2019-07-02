package com.example.cinema.services;



import com.example.cinema.entities.*;

import org.springframework.stereotype.Service;

import com.example.cinema.repositories.CategorieRepository;
@Service
public class CategoriesService implements ICategoriesService{
	

	public CategorieRepository cr;
	
	public Catégories getCatégoriesByID(int id) {
		return cr.getOne(id);
		
	}
	
	public Catégories addCategorie(Catégories c) {
		return cr.save(c);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		cr.deleteById(id);
	}

}
