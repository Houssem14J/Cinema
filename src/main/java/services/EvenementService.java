package services;

import java.util.List;

import entities.Evenement;
import repositories.EvenementRepository;
import org.springframework.stereotype.Service;
@Service
public class EvenementService implements IEvenementService{
	
	public EvenementRepository er;
	public List<Evenement> findAll()
	{
		List<Evenement> events = (List<Evenement>)er.findAll();
		return events;
	}
	
	public Evenement getEventId(int id ) {
		return er.getOne(id);
	}
	
	public Evenement addEvent(Evenement e) {
		return er.save(e);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		er.deleteById(id);
	}
}
