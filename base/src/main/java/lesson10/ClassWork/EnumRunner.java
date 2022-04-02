package lesson10.ClassWork;

import lesson10.ClassWork.enumerattion.Language;
import lesson10.ClassWork.inter.Printable;

public class EnumRunner {
    public static void main(String[] args) {
        Printable printable = new Printer();
        printable.printHelloWorld(Language.FRENCH);
        printable.printHelloWorld(Language.as(12));

        System.out.println(Language.GERMAN.asString());
        System.out.println(Language.GERMAN.toString());
    }
}
