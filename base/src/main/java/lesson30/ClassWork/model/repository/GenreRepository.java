package lesson30.ClassWork.model.repository;

import lesson30.ClassWork.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface GenreRepository extends JpaRepository<Genre, String> {
}
