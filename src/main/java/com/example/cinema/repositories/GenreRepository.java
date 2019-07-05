package com.example.cinema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import com.example.cinema.entities.*;

@org.springframework.stereotype.Repository
public interface GenreRepository extends Repository<Genre, Integer >, JpaRepository<Genre, Integer>{

	

}
