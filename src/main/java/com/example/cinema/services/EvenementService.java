package com.example.cinema.services;

import java.util.List;

import com.example.cinema.entities.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cinema.repositories.EvenementRepository;
@Service("es")
public class EvenementService implements IEvenementService{
	
	@Autowired
	public EvenementRepository er;
	
	@Override
	public List<Evenement> findAll()
	{
		
		return er.findAll();
	}
	
	
	@Override
	public Evenement getEventId(Integer id ) {
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
