package lesson25.ClassWork.spring.service.impl;

import lesson25.ClassWork.spring.service.PersonService;

//@Primary
//@Component
public class AnotherPersonServiceImpl implements PersonService {

    @Override
    public void print() {
        System.out.println("New person service print");
    }
}
