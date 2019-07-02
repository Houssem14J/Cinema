package com.example.cinema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import com.example.cinema.entities.*;

@org.springframework.stereotype.Repository
public interface FilmRepository extends JpaRepository<Film, Integer>{

	public Film findFilmByLibellé(String libellé);

}
