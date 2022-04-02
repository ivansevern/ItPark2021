package lesson2.HomeWork;

/*
        сos φ - коэффициент мощности, показывающий потребление реактивной мощности, для электромашин он равен 0,8-0,85
        Р - мощность, в кВт (1 кВт = 1000 Вт);
        U - напряжение, в Вольтах;
        I - сила тока, в Амперах.
        korOf3 = √3
        Перевод Амперы в кВт по формуле  P = √3*U*I*сosφ - для трехфазной сети
        Перевод Амперы в кВт по формуле  P = U*I*сosφ    - для однофазной сети
*/

public class ElectricalOfPower implements for380, for220 {
    public static void main(String[] args) {

        double cosφ = 0.85;
        double I = 10;
        double korOf3 = Math.sqrt(3);

        for380.pFor380(korOf3, I, cosφ);
        for220.pFor220(I, cosφ);

    }

}

