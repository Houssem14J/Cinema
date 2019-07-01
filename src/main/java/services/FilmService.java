package services;

import java.util.List;

import entities.Film;
import repositories.FilmRepository;
import org.springframework.stereotype.Service;
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
