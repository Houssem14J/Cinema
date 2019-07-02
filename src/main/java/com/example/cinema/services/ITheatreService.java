package com.example.cinema.services;

import java.util.List;

import com.example.cinema.entities.*;

public interface ITheatreService {

	public Theatre getTheatreByID(int id);
	public List<Theatre> findAll();
	public Theatre AddTheatre(Theatre t);
	public void delete(int id);
}
