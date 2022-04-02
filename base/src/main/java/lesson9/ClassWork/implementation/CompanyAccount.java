package lesson9.ClassWork.implementation;

import lesson9.ClassWork.Account;

import static lesson9.ClassWork.Course.CURRENT_VALUE;

public class CompanyAccount extends Account {

    public static int COUNT = 0;

//    private static final double COURSE = 75.56; // 1$ = 75.56рублей

    public CompanyAccount(String name) {
        super(name);
        COUNT++;
    }

    public double getBalanceInDollars() {
        if (isBlocked()) {
            return 0;
        }
        return this.getBalance() / CURRENT_VALUE;
    }

    @Override
    protected void printBalance() {
        System.out.println("Текущий баланс в долларах: " + getBalanceInDollars());
    }
}
