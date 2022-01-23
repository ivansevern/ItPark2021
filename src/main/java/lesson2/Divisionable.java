package lesson2;

public interface Divisionable {
    static int division(int arg1, int arg2) {

        int div = arg1 / arg2;
        System.out.println("Результат деления: " + arg1 + " / " + arg2 + " = " + div);
        return div;
    }
}
