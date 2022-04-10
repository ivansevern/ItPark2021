package lesson39.ClassWork.service;

import lesson18.ClassWork.dto.Person;

public interface PersonService {

    Person getByName(String name);

    String getName();
}
