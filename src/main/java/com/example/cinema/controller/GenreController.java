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

import com.example.cinema.entities.Genre;
import com.example.cinema.services.IGenreService;

@RestController
@RequestMapping(value="/genre")
public class GenreController {
	
	@Autowired
	public IGenreService gs;
	
	@GetMapping("/getAllGenres")
	public List<Genre> getAll(){
		return gs.FindAll();
	}
	
	@GetMapping("/getGenreById/{id}")
	public Genre getGenre(@PathVariable int id) {
		
		return gs.getGenreById(id);
	}
	
	@PostMapping("/addGenre")
	public void addGenre(@RequestBody Genre g) {
		gs.AddGenre(g);
	}
	
	@DeleteMapping("/deleteGenre")
	public void deleteGenre(@PathVariable int id) {
		gs.delete(id);
	}
	
	

}
