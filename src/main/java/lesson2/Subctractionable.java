package lesson2;

public interface Subctractionable {
    static int subtraction(int arg1, int arg2) {

        int sub = arg1 - arg2;
        System.out.println("Результат вычитания: " + arg1 + " - " + arg2 + " = " + sub);
        return sub;
    }
}
