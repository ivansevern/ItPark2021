package lesson10.HomeWork.ConvMoney;

import java.util.Scanner;

//P.S. мог, что-то не так понять в выполнении, то ли сделал!

class ConverterRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Converter converter = new Converter();

        while (true) {
            printMenu();
            int command = scanner.nextInt();
            if (command == 1) {
                converter.toUSD();
            } else if (command == 2) {
                converter.toEUR();
            } else if (command == 0) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        }
    }

    public static void printMenu() {
        System.out.println(" Выберите необходимое действие: ");
        System.out.println("1 - Перевести RUB в USD");
        System.out.println("2 - Перевести RUB в EUR");
        System.out.println("0 - Выход");
    }
}
