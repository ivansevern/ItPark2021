package lesson10.ConvTemp;

import java.util.Scanner;

class ConvertC implements FtoC {
    public static void convertC() {
        Scanner scanner = new Scanner(System.in);
        float F;
        System.out.println("Введите Градусы Цельсия - C: ");
        float n = scanner.nextFloat();
        F =  ( (float)n * (9.0f / 5.0f)) + 32.0f;
        String format = String.format("%.2f", F);
        System.out.println(format);
        return;
    }
}

