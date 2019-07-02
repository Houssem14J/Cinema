package com.example.cinema.services;

import java.util.List;

import com.example.cinema.entities.*;

import org.springframework.stereotype.Service;

import com.example.cinema.repositories.EvenementRepository;
@Service
public class EvenementService implements IEvenementService{
	
	public EvenementRepository er;
	public List<Evenement> findAll()
	{
		List<Evenement> events = (List<Evenement>)er.findAll();
		return events;
	}
	
	public Evenement getEventId(int id ) {
		return er.getOne(id);
	}
	
	public Evenement addEvent(Evenement e) {
		return er.save(e);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		er.deleteById(id);
	}
}
