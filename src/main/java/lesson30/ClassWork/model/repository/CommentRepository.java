package lesson30.ClassWork.model.repository;

import lesson30.ClassWork.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
