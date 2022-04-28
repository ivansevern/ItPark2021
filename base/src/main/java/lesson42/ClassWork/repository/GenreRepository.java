package lesson42.ClassWork.repository;

import lesson42.ClassWork.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, String> {
}
