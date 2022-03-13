package lesson26.ClassWork.impl;

import lesson18.ClassWork.dto.Person;
import lesson25.ClassWork.spring.dao.PersonDao;
import lesson26.ClassWork.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonDao personDao;

    @Override
    public void save(Person person) {

    }
}
