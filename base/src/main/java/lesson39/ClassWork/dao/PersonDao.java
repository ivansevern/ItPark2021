package lesson39.ClassWork.dao;

import lesson18.ClassWork.dto.Person;

public interface PersonDao {

    Person findByName(String name);

    String getName();
}
