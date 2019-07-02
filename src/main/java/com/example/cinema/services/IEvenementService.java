package com.example.cinema.services;

import java.util.List;

import com.example.cinema.entities.*;

public interface IEvenementService {

	
	public List<Evenement> findAll();
	public Evenement getEventId(Integer id );
	public Evenement addEvent(Evenement e);
	public void delete(int id);
}
