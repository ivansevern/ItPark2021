package lesson39.ClassWork.service.impl;

import lesson18.ClassWork.dto.Person;
import lesson39.ClassWork.dao.PersonDao;
import lesson39.ClassWork.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonDao personDao;

    @Override
    public Person getByName(String name) {
        return personDao.findByName(name);
    }

    @Override
    public String getName() {
        return personDao.getName();
    }
}
