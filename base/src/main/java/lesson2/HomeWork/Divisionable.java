package lesson2.HomeWork;

public interface Divisionable {
    static int div(int arg1, int arg2) {

        int div = arg1 / arg2;
        System.out.println("Результат деления: " + arg1 + " / " + arg2 + " = " + div);
        return div;
    }
}
