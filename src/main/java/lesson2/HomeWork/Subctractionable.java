package lesson2.HomeWork;

public interface Subctractionable {
    static int sub(int arg1, int arg2) {

        int sub = arg1 - arg2;
        System.out.println("Результат вычитания: " + arg1 + " - " + arg2 + " = " + sub);
        return sub;
    }
}
