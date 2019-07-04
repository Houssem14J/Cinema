package com.example.cinema.services;



import com.example.cinema.entities.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cinema.repositories.CategorieRepository;
@Service("ICategoriesService")
public class CategoriesService implements ICategoriesService{
	
	@Autowired
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

	@Override
	public List<Catégories> findAll() {
		return cr.findAll();
	}

}
