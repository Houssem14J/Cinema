package com.example.cinema.services;

import java.util.List;

import com.example.cinema.entities.Client;

public interface IClientService {
	
	
	public List<Client> getAll();
	public Client getClientById(int id);
	public void addClient(Client c);
	public void deleteClient(int id);
	
}
