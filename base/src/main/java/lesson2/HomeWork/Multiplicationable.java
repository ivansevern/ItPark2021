package lesson2.HomeWork;

public interface Multiplicationable {
    static int mult(int arg1, int arg2) {

        int mult = arg1 * arg2;
        System.out.println("Результат умножения: " + arg1 + " * " + arg2 + " = " + mult);
        return mult;
    }
}
