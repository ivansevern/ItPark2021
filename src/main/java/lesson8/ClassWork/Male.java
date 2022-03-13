package lesson8.ClassWork;

public class Male extends Human {

    public Male(String fio, int age, String nationality) {
        super(fio, age, nationality);
    }

    public void drive() {
        System.out.println("Мужчина умеет водить автомобиль");
    }

}
