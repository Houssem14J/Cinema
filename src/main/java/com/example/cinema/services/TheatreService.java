package com.example.cinema.services;

import java.util.List;

import com.example.cinema.entities.*;

import org.springframework.stereotype.Service;

import com.example.cinema.repositories.TheatreRepository;
@Service
public class TheatreService implements ITheatreService{

	
	public TheatreRepository tr;
	
	@Override
	public Theatre getTheatreByID(int id) {
		// TODO Auto-generated method stub
		return tr.getOne(id);
	}

	@Override
	public List<Theatre> findAll() {
		// TODO Auto-generated method stub
		return tr.findAll();
	}

	@Override
	public Theatre AddTheatre(Theatre t) {
		// TODO Auto-generated method stub
		return tr.save(t);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		tr.deleteById(id);
	}

	
	
}
