package lesson29.ClassWork.dao;

import lesson29.ClassWork.model.Employee;

import java.util.List;

public interface EmployeeDao {
    List<Employee> findAll();
}
