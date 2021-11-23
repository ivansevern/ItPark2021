package lesson6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

// Еще не доделал!
public class FindFibOfMassive {
    public static void main(String[] args) {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        int n = bufferedReader.read();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int N = n + 1;

//        int[] fib = new int[5];
//        fib[0] = 0;
//        fib[1] = 1;
//
////        fib[2] = fib[0] + fib[1];
//        for (int i = 2; i <= n; i++) {
//            fib[2] = fib[0] + fib[1];
//            fib[0] = fib[1];
//            fib[1] = fib[2];
//        }
        System.out.println(n);
    }
}
