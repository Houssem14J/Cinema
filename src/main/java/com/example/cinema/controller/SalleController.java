package com.example.cinema.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.cinema.entities.Salle;
import com.example.cinema.repositories.SalleRepository;
import com.example.cinema.services.ISalleService;
import com.example.cinema.services.SalleService;

@RestController
@RequestMapping(value="/salle")
public class SalleController {
	@Autowired
	private ISalleService iss;
	@Autowired
	private SalleRepository sr;
	
	@PostMapping("/ajoutSalle")
	public Salle Ajoutsalle(@RequestBody Salle s ) {
		return iss.Ajoutsalle(s);	
	}
	
	@DeleteMapping("/deleteSalle/{id}")
	public void DeleteSalle(@PathVariable("id") Integer id) {
		iss.DeleteSalle(id);
	}
	
	@GetMapping("/allSalle")
	public List<Salle> ListeSalle(){
		return iss.ListeSalle();
	}
	
	@GetMapping("/salle/{id}")
	public Salle getSallebyid(@PathVariable("id") Integer id) {
		return iss.getSallebyid(id);
	}
}
