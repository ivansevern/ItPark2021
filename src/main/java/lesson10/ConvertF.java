package lesson10;

class ConvertF implements CtoF{
    public static double convertF(double n) {
        double C;
       // Scanner scanner = new Scanner(System.in);
       // n = scanner.nextDouble();
        C =  (( n * 9d / 5d) + 32d);
        System.out.println(C);
        return n;
    }
//    @Override
//    public void CtoF() {
//        double C, n;
//        Scanner scanner = new Scanner(System.in);
//        n = scanner.nextDouble();
//        C =  ((n * 9.0d / 5.0d) + 32.0d);
//        System.out.println(C);
//    }

//    @Override
//    public double convertF(double n) {
//        double C;
//        Scanner scanner = new Scanner(System.in);
//        n = scanner.nextDouble();
//        C =  ((n * 9.0d / 5.0d) + 32.0d);
//        System.out.println(C);
//        return n;
//    }
}



