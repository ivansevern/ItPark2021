package lesson31.ClassWork.repository;

import lesson25.ClassWork.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
