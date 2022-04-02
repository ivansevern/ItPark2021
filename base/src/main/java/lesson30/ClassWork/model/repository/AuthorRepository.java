package lesson30.ClassWork.model.repository;

import lesson30.ClassWork.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
