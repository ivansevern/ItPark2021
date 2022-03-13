package lesson6.HomeWork;
import java.util.Scanner;

/*
 * Заполните массив (длина запрашивается у пользователя через консоль)
 * случайными числами, используя метод Math.random(), который возвращает
 * значение в промежутке [0, 1]. Реализуйте 3 метода, расчитывающих
 * минимальное, максимальное и среднее значения среди заполненных
 * значений массива.
 */

public class FindValueMassive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Введите длину массива: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Вы ввели некоректное значение!");
                scanner.next();
            }
            n = scanner.nextInt();
        }
        while (n < 0);
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        double min = array[0];
        double med = 0;
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
            if (min > array[i])
                min = array[i];
            med += array[i] / array.length;
        }
        System.out.println("Минимальное число массива = " + min);
        System.out.println("Среднее число массива = " + med);
        System.out.println("Максимальное число массива = " + max);
    }
}
