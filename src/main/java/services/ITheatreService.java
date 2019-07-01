package services;

import java.util.List;

import entities.Theatre;

public interface ITheatreService {

	public Theatre getTheatreByID(int id);
	public List<Theatre> findAll();
	public Theatre AddTheatre(Theatre t);
	public void delete(int id);
}
