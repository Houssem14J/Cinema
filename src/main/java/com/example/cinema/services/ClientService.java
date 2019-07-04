package com.example.cinema.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cinema.entities.Client;
import com.example.cinema.repositories.ClientRepository;

@Service
public class ClientService implements IClientService {

	@Autowired
	public ClientRepository cr;

	@Override
	public List<Client> getAll() {
		return cr.findAll();

	}

	@Override
	public Client getClientById(int id) {
		// TODO Auto-generated method stub
		return cr.getOne(id);
	}

	@Override
	public void addClient(Client c) {
		cr.save(c);
	}

	@Override
	public void deleteClient(int id) {
		cr.deleteById(id);
	}
	
	
}
