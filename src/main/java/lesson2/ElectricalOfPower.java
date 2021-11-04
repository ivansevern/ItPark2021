package lesson2;

/*
        сos φ - коэффициент мощности, показывающий потребление реактивной мощности, для электромашин он равен 0,8-0,85
        Р - мощность, в кВт (1 кВт = 1000 Вт);
        U - напряжение, в Вольтах;
        I - сила тока, в Амперах.
        korOf3 = √3
        Перевод Амперы в кВт по формуле  P = √3*U*I*сosφ - для трехфазной сети
        Перевод Амперы в кВт по формуле  P = U*I*сosφ    - для однофазной сети
*/

public class ElectricalOfPower {
    public static void main(String[] args) {

        double cosφ = 0.85;
        double I = 10;
        double korOf3 = Math.sqrt(3);

        pFor380(korOf3, I, cosφ);
        pFor220(I, cosφ);

    }

    public static double pFor380(double korOf380, double I, double cosφ) {

        double U = 380;
        double P = (korOf380 * U * I * cosφ) / 1000;
        System.out.println("Для трехфазной сети: P = " + P + " кВт");
        return P;
    }

    public static double pFor220(double I, double cosφ) {

        double U = 220;
        double P = (U * I * cosφ) / 1000;
        System.out.println("Для однофазной сети: P = " + P + " кВт");
        return P;
    }
}

