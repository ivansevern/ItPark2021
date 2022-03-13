package lesson9.ClassWork.implementation;

import lesson9.ClassWork.Account;

public class PersonalAccount extends Account {

    public PersonalAccount(String name) {
        super(name);
    }

    public static String getBic() {
        return "464315021";
    }

    @Override
    protected void printBalance() {
        System.out.println("Текущий баланс: " + getBalance());
    }
}
