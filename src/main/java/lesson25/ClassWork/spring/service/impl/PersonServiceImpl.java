package lesson25.ClassWork.spring.service.impl;

import lesson25.ClassWork.spring.dao.PersonDao;
import lesson25.ClassWork.spring.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

//@Component
public class PersonServiceImpl implements PersonService {

    private final PersonDao personDao;

    @Autowired
    public PersonServiceImpl(PersonDao personDao) {
        this.personDao = personDao;
    }

    @Override
    public void print() {
        personDao.save();
    }
}
