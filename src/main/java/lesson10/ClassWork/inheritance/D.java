package lesson10.ClassWork.inheritance;

public class D extends B {

    private String field = "";

    public D() {
        super("");
        System.out.println("Вызван конструктор класса D");
    }

    public static String str() {
        return "String";
    }
}
