package lesson10.ClassWork.inter;

public interface PrintableAndCheckable extends Printable, Checkable {

    void otherPrint();

    default void print(int index) {
        Checkable.super.print(index);
        Printable.super.print(index);
    }
}
