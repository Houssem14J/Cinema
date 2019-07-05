package com.example.cinema.services;

import java.util.List;

import com.example.cinema.entities.Salle;

public interface ISalleService 	 {
  public Salle Ajoutsalle(Salle s);
  public void DeleteSalle(Integer id);
  public List<Salle> ListeSalle();
  public Salle getSallebyid(Integer id);
}
