package lesson10.ConvTemp;

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
        System.out.println("Hello!");

        while (true) {
            printMenuTemp();
            int command = scanner.nextInt();
            if (command == 1) {
                ConvertC.convertC();
            } else if (command == 2) {
                ConvertF.convertF();
            } else if (command == 3) {

                break;
            } else if (command == 4) {

                break;
            } else if (command == 0) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        }
    }

    public static void printMenuTemp() {
        System.out.println(" Выберите необходимое действие: ");
        System.out.println("1 - Перевести градусы Цельсия в Форенгейт");
        System.out.println("2 - Перевести градусы Форенгейт в Цельсия");
        System.out.println("3 - Перевести в USD");
        System.out.println("4 - Перевести в EUR");
        System.out.println("0 - Выход");
    }
}
