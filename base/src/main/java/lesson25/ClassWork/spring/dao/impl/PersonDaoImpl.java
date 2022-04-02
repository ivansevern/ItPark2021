package lesson25.ClassWork.spring.dao.impl;

import lesson25.ClassWork.spring.dao.PersonDao;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDaoImpl implements PersonDao {

    @Override
    public void save() {
        System.out.println("Person has been successfully saved");
    }
}
