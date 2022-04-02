package lesson2.HomeWork;

public interface Sumable {
    static int sum(int arg1, int arg2) {

        int sum = arg1 + arg2;
        System.out.println("Результат сложения: " + arg1 + " + " + arg2 + " = " + sum);
        return sum;
    }
}
