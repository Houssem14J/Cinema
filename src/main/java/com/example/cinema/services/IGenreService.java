package com.example.cinema.services;

import java.util.List;

import com.example.cinema.entities.*;

public interface IGenreService {

	public Genre getGenreById(int id);
	public List<Genre> FindAll();
	public Genre AddGenre(Genre g);
	public void delete(int id);
	
	
}
