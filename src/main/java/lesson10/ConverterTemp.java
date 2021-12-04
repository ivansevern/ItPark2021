package lesson10;

/* Необходимо реализовать конвертер температур, который сможет переводить единицы измерения одной системы
в другую (например: из Цельсий в Фаренгейты, или Кельвин и Цельсий).
   Конвертер должен быть универсальным с возможностью перевода в обоих направлениях для каждой из комбинаций.
   В задании требуется масимально воспользоваться возможностями интерфейсов и перечислений, насколько
это возможно.
   По тому же принципу можно реализовать валютный конвертер или любой понравившийся.
*/

import java.util.Scanner;

public class ConverterTemp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = 0;

        while (true) {
            printMenu();
            int command = scanner.nextInt();
            if (command == 1) {
                System.out.println("Введите Градусы Цельсия - C: ");
                ConvertF.convertF(checkInput(n));
            } else if (command == 2) {
                System.out.println("Введите Фаренгейт - F: ");
                ConvertC.convertC(checkInput(n));
            } else if (command == 0) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        }
    }

    private static double checkInput(double n) {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextDouble()) {
                System.out.println("Вы ввели некоректное значение!");
                scanner.next();
            }
             n = scanner.nextDouble();
            if (n <= 0) {
                System.out.printf("Вы ввели отрицательное число! %d \n", n);
                return checkInput(n);
            }
            return n;
        }

    public static void printMenu() {
        System.out.println(" Выберите необходимое действие: ");
        System.out.println("1 - Перевести градусы Цельсия в Форенгейт");
        System.out.println("2 - Перевести градусы Форенгейт в Цельсия");
        System.out.println("0 - Выход");
    }
}