package com.example.cinema.services;

import java.util.List;

import com.example.cinema.entities.*;

public interface IFilmServices {

	public Film getFilmById(int id);
	public List<Film> FindAll();
	public Film AddFilm(Film f);
	public void delete(int id);
}
