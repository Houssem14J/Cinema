package com.example.cinema.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cinema.entities.Catégories;
import com.example.cinema.repositories.CategorieRepository;
import com.example.cinema.services.CategoriesService;
import com.example.cinema.services.ICategoriesService;

@RestController
@RequestMapping(value="/categorie")
public class CategorieControlleur {
	
	
	
	@Autowired
	ICategoriesService catservice;
	
	@Autowired
	CategorieRepository catrepository;
	
	
	@PostMapping(value="/add")
	public Catégories addCategorie(@RequestBody Catégories c) {
		
		
		return catservice.addCategorie(c);
		
	}
	
	
	@GetMapping(value="/getOne/{id}")
	public Catégories getCatégoriesByID(@PathVariable("id")int id) {
		
		return catservice.getCatégoriesByID(id);
		
	}
	

	@GetMapping(value="/getAll")
	public List<Catégories> getAll(){
		
	return	catservice.findAll();
		
		
	}
	
	
	@DeleteMapping(value="/delete/{id}")
	public void delete(@PathVariable("id") int id){
		
		catservice.delete(id);
	}
	
	
	
}
