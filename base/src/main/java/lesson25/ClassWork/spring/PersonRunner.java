package lesson25.ClassWork.spring;

import lesson25.ClassWork.spring.service.PersonService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonRunner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("/spring-context.xml");
        PersonService personService = (PersonService) classPathXmlApplicationContext.getBean("newPersonService");
//        PersonService personService = classPathXmlApplicationContext.getBean(PersonService.class);
        personService.print();
    }
}
