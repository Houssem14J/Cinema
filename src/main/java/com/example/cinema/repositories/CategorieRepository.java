package com.example.cinema.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import com.example.cinema.entities.*;
@org.springframework.stereotype.Repository
public interface CategorieRepository extends Repository<Catégories, Integer>, JpaRepository<Catégories, Integer> {

	public Catégories findCatégoriesByDescription(String descirption);
	public List<Catégories> findAll();

}
