package com.example.cinema.services;

import java.util.List;

import com.example.cinema.entities.*;
import org.springframework.stereotype.Service;

import com.example.cinema.repositories.FilmRepository;
@Service
public class FilmService implements IFilmServices{

	public FilmRepository fr;

	@Override
	public Film getFilmById(int id) {
		return fr.getOne(id);
	}

	@Override
	public List<Film> FindAll() {
		return fr.findAll();
	}

	@Override
	public Film AddFilm(Film f) {
		return fr.save(f);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		fr.deleteById(id);
	}
	
	
}
