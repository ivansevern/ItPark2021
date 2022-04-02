package lesson4.HomeWork;

import java.util.Scanner;

/*
* Необходимо вычислить квадратный корень числа, не используя готовую реализацию метода Math.sqrt,
* а пологаясь на простые арифметические операции.
*  */
public class FourthProgram {
    public static void main(String[] args) {
        text();
    }

        public static int kor(int n) {
        if (n<2) return n;
        int i = 1;
        while (i * i <= n) {
            if (i * i <= 0) break;
            i++;
        }
        return --i;
    }

    public static void text() {
        Scanner scanner = new Scanner(System.in);
        int sqrt;
        System.out.print("Введите число для расчета его корня: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Вы ввели некоректное значение!");
                scanner.next();
        }
        sqrt = scanner.nextInt();
        if (sqrt <= 0) {
            System.out.println("Значение не может быть 0 и меньше 0");
            scanner.next();
        } else if (kor(sqrt) * kor(sqrt) != sqrt) {
            System.out.println("Это не целочисленный корень");
        }
        else {
            System.out.println("Корень целого числа: " + sqrt + " = " + kor(sqrt));
        }
    }
}
