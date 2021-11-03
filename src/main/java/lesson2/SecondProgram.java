package lesson2;

public class SecondProgram {

    public static void main(String[] args) {

        /*int sum = sum(18, 2);

        int sub = subtraction(18, 2);

        int mult = multiplication(18, 2);

        int div = division(18, 2);*/
    }

    public static int sum(int arg1, int arg2) {

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





   /* public static long multiplyAndSumma(int arg1) {
        int result = 3 * arg1 + 15;
        result = result - 38;
        return result;
    }*/
}
