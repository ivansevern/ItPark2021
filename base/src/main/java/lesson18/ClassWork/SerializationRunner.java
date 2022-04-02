package lesson18.ClassWork;

import lesson18.ClassWork.dto.Person;
import lesson18.ClassWork.dto.Sex;
import lombok.SneakyThrows;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationRunner {

    @SneakyThrows
    public static void main(String[] args) {
        Person ivanovVitaliy = new Person("Ivanov Vialiy12", 33, Sex.MALE, 190);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\test\\person.dat"))) {
            oos.writeObject(ivanovVitaliy);
        }
    }
}
