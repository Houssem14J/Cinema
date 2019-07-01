package services;

import java.util.List;

import entities.Genre;

public interface IGenreService {

	public Genre getGenreById(int id);
	public List<Genre> FindAll();
	public Genre AddGenre(Genre g);
	public void delete(int id);
	
	
}
