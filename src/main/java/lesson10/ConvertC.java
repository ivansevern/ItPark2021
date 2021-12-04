package lesson10;

class ConvertC implements FtoC {

    public static double convertC(double n) {
        double F;
        F = ((n - 32d) * 5d) / 9d;
        System.out.println(F);
        return n;
    }
}

