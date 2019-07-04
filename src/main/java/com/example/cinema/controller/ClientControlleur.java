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
import org.springframework.web.bind.annotation.RestController;

import com.example.cinema.entities.Client;
import com.example.cinema.repositories.ClientRepository;
import com.example.cinema.services.IClientService;

@RestController
@RequestMapping(value="/client")
public class ClientControlleur {
	
	@Autowired
	public IClientService cs;
	
	@Autowired
	public ClientRepository cr;
	
	@PostMapping("/addClient")
	public void addClient(@RequestBody Client c) {
		cs.addClient(c);
	}
	
	@GetMapping("/getClientId/{id}")
	public Client getClientByID(@PathVariable("id") int id) {
		return cs.getClientById(id);
	}
	
	@GetMapping("/getAllClients")
	public List<Client> getAll (){
		return cs.getAll();
	}
	
	@DeleteMapping("/deleteClient/{id}")
	public void deleteClient(@PathParam("id") int id) {
		cs.deleteClient(id);
	}
	
	@PostMapping(value="/Login")
	public Client login(@RequestBody Client c) {
		return cr.login(c.getUsername(), c.getPassword());
	}

	
	
	


}
