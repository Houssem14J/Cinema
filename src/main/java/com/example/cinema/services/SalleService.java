package com.example.cinema.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cinema.entities.Salle;
import com.example.cinema.repositories.SalleRepository;

@Service
public class SalleService implements ISalleService {
	@Autowired
	public  SalleRepository sr;
	
	@Override
	public Salle Ajoutsalle(Salle s) {
		return sr.save(s);
	}

	@Override
	public void DeleteSalle(Integer id) {
		sr.deleteById(id);
	}

	@Override
	public List<Salle> ListeSalle() {
		return sr.findAll();
	}

	@Override
	public Salle getSallebyid(Integer id) {
		return sr.getOne(id);
	}
}
