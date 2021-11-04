package lesson2;

public class SecondProgram {

    public static void main(String[] args) {

        int arg1 = 20;
        int arg2 = 10;

        int sum = summa(arg1, arg2);

        int sub = subtraction(arg1, arg2);

        int mult = multiplication(arg1, arg2);

        int div = division(arg1, arg2);

    }

    public static int summa(int arg1, int arg2) {

        int sum = arg1 + arg2;
        System.out.println("Результат сложения: " + arg1 + " + " + arg2 + " = " + sum);
        return sum;
    }

    public static int subtraction(int arg1, int arg2) {

        int sub = arg1 - arg2;
        System.out.println("Результат вычитания: " + arg1 + " - " + arg2 + " = " + sub);
        return sub;
    }
    public static int multiplication(int arg1, int arg2) {

        int mul = arg1 * arg2;
        System.out.println("Результат умножения: " + arg1 + " * " + arg2 + " = " + mul);
        return mul;
    }

    public static int division(int arg1, int arg2) {

        int div = arg1 / arg2;
        System.out.println("Результат деления: " + arg1 + " / " + arg2 + " = " + div);
        return div;
    }
}
