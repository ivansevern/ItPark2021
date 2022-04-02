package lesson10.HomeWork.ConvTemp;

import java.util.Scanner;

class ConvertF implements CtoF{
    public static void convertF() {
        Scanner scanner = new Scanner(System.in);
        float C;
        System.out.println("Введите Фаренгейт - F: ");
        float n = scanner.nextFloat();
        C = (n - 32.0f) * (5.0f / 9.0f);
       // C = (5.0f/9.0f) * (n -(32.0f));
        String format = String.format("%.2f", C);
        System.out.println(format);
        return;
    }
}



