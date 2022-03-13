package lesson10.ClassWork.inter;

public interface Checkable {
    boolean check();

    default void print(int index) {
        System.out.println("Совершенно другой текст");
    }
}
