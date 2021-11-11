package lesson4;

import java.util.Scanner;

/*
* Необходимо вычислить квадратный корень числа, не используя готовую реализацию метода Math.sqrt,
* а пологаясь на простые арифметические операции.
*  */
public class FourthProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для расчета его корня: ");
        int sqrt = scanner.nextInt();
        System.out.println("Корень числа: " + sqrt + " = " + kor(sqrt));
    }

    public static int kor(int n) {
        int num;
        int sqrt = n/2;
        do {
            num = sqrt;
            sqrt = (num+(n/num)) /2;
        }
        while ((num-sqrt) != 0);
        return sqrt;
    }
}
