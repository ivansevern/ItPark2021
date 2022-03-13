package lesson15.ClassWork;

@FunctionalInterface
public interface DefaultLambda {

    default void print(String str) {
        System.out.println(str);
    }

    void print(); // обязательно на случай лямбды
}
