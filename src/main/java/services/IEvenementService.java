package services;

import java.util.List;

import entities.Evenement;

public interface IEvenementService {

	public List<Evenement> findAll();
	public Evenement getEventId(int id );
	public Evenement addEvent(Evenement e);
	public void delete(int id);
}
