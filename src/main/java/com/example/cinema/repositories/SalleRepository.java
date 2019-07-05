package com.example.cinema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cinema.entities.Salle;

@Repository
public interface SalleRepository extends JpaRepository<Salle, Integer>   {
	
}
