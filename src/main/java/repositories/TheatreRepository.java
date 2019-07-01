package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import entities.Theatre;

@org.springframework.stereotype.Repository
public interface TheatreRepository extends Repository<Theatre, Integer>, JpaRepository<Theatre, Integer>{

}
