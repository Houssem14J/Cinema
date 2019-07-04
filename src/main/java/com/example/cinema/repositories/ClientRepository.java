package com.example.cinema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.example.cinema.entities.Client;

@org.springframework.stereotype.Repository
public interface ClientRepository extends JpaRepository<Client, Integer>, Repository<Client, Integer> {

	@Query("select c from Client c where c.username=?1 and c.password=?2")
	public Client login(String username,String password);
	
}
