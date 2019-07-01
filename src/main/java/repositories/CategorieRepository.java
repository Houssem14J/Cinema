package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import entities.Catégories;
@org.springframework.stereotype.Repository
public interface CategorieRepository extends Repository<Catégories, Integer>, JpaRepository<Catégories, Integer> {

	public Catégories findCatégoriesByCatégories(String descirption);
	public Catégories findAllCatégories();

}
