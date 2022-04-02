package lesson6.HomeWork;

/*
Вычисление ряда Фибоначчи, используя массив как промежуточный кэш.
Если запрашивается значение, которое раннее было вычислено, то оно
берется из массива (без вычисления). В противном случае - значение
расчитывается и кладется в массив.
*/

import java.util.Scanner;

public class DigitsFibonacciOfMassive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        findFib(scanner);

    }

    private static void findFib(Scanner scanner) {
        int n;
       // int[] fib = new int[10];
        do {
            System.out.print("Введите положительное целое число для расчета : ");
            while (!scanner.hasNextInt()) {
                System.out.println("Вы ввели некоректное значение!");
                scanner.next();
            }
            n = scanner.nextInt();
        }
        while (n < 0);
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.print("Ряд чисел Фибоначчи: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}