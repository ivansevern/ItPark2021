package lesson3;

import java.util.Scanner;

/*
* 1. Вычисление корней квадратного уравнения.
*    Метод принимает в качестве аргументов коэффициенты a, b, c квадратного уравнения (a*x^+b*x+c=0).
*    В теле метода требуется вывести на экран значения корней этого уравнения согласно следующим правилам:
*    - если первый коэффициент a равен нулю, то вывести "Первый коэффициент не может быть 0".
*    - если уравнение не имеет корней, то вывести "Нет действительных решений уравнения".
*    - если уравнение имеет два корня, то вывести их в строку через пробел (для одного корня, достаточно одного
*      значения).
* 2. Вычисление факториала числа n!, где n - входной параметр метода (целое число), в качестве результата
*    должно вернуться значение равное 1*2*..*n, при этом 1!=1, 2!=2 и т.д.
*/
public class ThirdProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение коэффициента a: ");
        int a = scanner.nextInt();
        System.out.print("Введите значение коэффициента b: ");
        int b = scanner.nextInt();
        System.out.print("Введите значение коэффициента c: ");
        int c = scanner.nextInt();
//        int d = 0;
        int d = b * b - 4 * a * c;
        pow(a,b,c);
    }

    public static void pow(int a, int b, int c) {

        double d = b * b - 4 * a * c;
        if (a == 0) {
            System.out.println("Первый коэффициент не может быть 0");
            return;
        }
        if (d > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(d)) / (2 * a);
            x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println((int)x1 +", " + (int)x2);
            return;
        }
        if (d == 0) {
            double x;
            x = -b / (2*a);
            System.out.println((int)x);
            return;
        } else {
            System.out.println("Нет действительных решений уравнения");
        }
    }
}
