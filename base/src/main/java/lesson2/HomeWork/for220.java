package lesson2.HomeWork;

public interface for220 {
    static double pFor220(double I, double cosφ) {

        double U = 220;
        double P = (U * I * cosφ) / 1000;
        String format = String.format("%.2f", P);
        System.out.println("Для однофазной сети: P = " + format + " кВт");
        return P;
    }
}
