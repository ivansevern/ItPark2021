package lesson2.HomeWork;

public interface for380 {
    static double pFor380(double korOf380, double I, double cosφ) {

        double U = 380;
        double P = (korOf380 * U * I * cosφ) / 1000;
        String format = String.format("%.2f", P);
        System.out.println("Для трехфазной сети: P = " + format + " кВт");
        return P;
    }
}
