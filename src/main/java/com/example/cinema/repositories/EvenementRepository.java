package com.example.cinema.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.example.cinema.entities.*;
@org.springframework.stereotype.Repository
public interface EvenementRepository extends Repository<Evenement, Integer> , JpaRepository<Evenement, Integer>{

	public Evenement findEvenementByNom(String nom);
	
}
