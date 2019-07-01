package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import entities.Evenement;
@org.springframework.stereotype.Repository
public interface EvenementRepository extends Repository<Evenement, Integer> , JpaRepository<Evenement, Integer>{

	public Evenement findEvenementByNom(String nom);
	
}
