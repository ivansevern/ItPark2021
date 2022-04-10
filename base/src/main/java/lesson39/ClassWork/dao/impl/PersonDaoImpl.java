package lesson39.ClassWork.dao.impl;

import lesson18.ClassWork.dto.Person;
import lesson39.ClassWork.dao.PersonDao;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDaoImpl implements PersonDao {

    private Person holder;

    @Override
    public Person findByName(String name) {
        return (this.holder = new Person(name));
    }

    @Override
    public String getName() {
        return this.holder == null ? null : this.holder.getName();
    }
}
