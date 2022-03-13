package lesson18.ClassWork;

import lesson18.ClassWork.dto.Person;
import lesson18.ClassWork.dto.Sex;
import lombok.SneakyThrows;

public class PersonRunner {

    @SneakyThrows
    public static void main(String[] args) {
        Person person = new Person("Ivanov Vitalii");
        person.setAge(33);
        Person newPerson = new Person();
        Person ivanov = new Person("Ivanov", 33, Sex.MALE, 190);
        person.beOlder();
    }

}
