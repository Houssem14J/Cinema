package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import entities.Genre;

@org.springframework.stereotype.Repository
public interface GenreRepository extends Repository<Genre, Integer >, JpaRepository<Genre, Integer>{

	public Genre findGenreByGenre(int id);

}
