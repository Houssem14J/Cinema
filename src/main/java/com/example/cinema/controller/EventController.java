package com.example.cinema.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cinema.services.*;

import com.example.cinema.entities.*;
@RestController
@CrossOrigin("*")
@RequestMapping(value="/event")
public class EventController {

	
	@Autowired
	public IEvenementService es;
	
	@PostMapping(value="/addEvent")
	public com.example.cinema.entities.Evenement addEvent(@RequestBody Evenement e) {
			
		return es.addEvent(e);
		
	}
	
	@GetMapping(value="/getAllEvent")
	public List<Evenement> getAll(){
		return es.findAll();
	}

	@GetMapping(value="/getSingleEvent/{id}")
	public Evenement getSingleEvent(@PathVariable("id") Integer id) {
		return es.getEventId(id);
		
	}

}
