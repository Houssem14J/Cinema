package services;

import java.util.List;

import entities.Film;

public interface IFilmServices {

	public Film getFilmById(int id);
	public List<Film> FindAll();
	public Film AddFilm(Film f);
	public void delete(int id);
}
