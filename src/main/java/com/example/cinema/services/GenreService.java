package com.example.cinema.services;

import java.util.List;

import com.example.cinema.entities.*;

import org.springframework.stereotype.Service;

import com.example.cinema.repositories.GenreRepository;
@Service
public class GenreService implements IGenreService{

	public GenreRepository gr;
	
	@Override
	public Genre getGenreById(int id) {
		
		return gr.getOne(id);
	}

	@Override
	public List<Genre> FindAll() {
		// TODO Auto-generated method stub
		return gr.findAll();
	}

	@Override
	public Genre AddGenre(Genre g) {
		// TODO Auto-generated method stub
		return gr.save(g);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		gr.deleteById(id);
	}
	

}
