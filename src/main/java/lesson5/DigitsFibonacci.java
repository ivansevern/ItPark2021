package lesson5;

import java.util.Scanner;

/*
 * Вывести n-ый член последовательности Фибоначчи, где параметр n запрашивается в консоли у пользователя
 * Числа Фибоначчи - 0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597...
 *  */

public class DigitsFibonacci {
    public static void main(String[] args) {
        int maxValue = 0;
        int lastValue = 0;
        int secondValue = 1;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Введите число для расчета : ");
            while (!scanner.hasNextInt()) {
                System.out.println("Вы ввели некоректное значение!");
                scanner.next();
            }
        }
        while (scanner.nextInt() < 0);
        maxValue = scanner.nextInt();
        System.out.println("Серия Фибоначчи " + maxValue + " чисел");
        for (int i = 1; i <= maxValue; i++) {
            System.out.println(lastValue + "");
            int sum = lastValue + secondValue;
            lastValue = secondValue;
            secondValue = sum;
        }
    }
}