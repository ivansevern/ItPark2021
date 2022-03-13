package lesson22.ClassWork;

import lesson22.ClassWork.dto.Account;

import java.math.BigDecimal;
import java.util.Comparator;

public class AccountService {

    public BigDecimal getMaxBalance(AccountDao accountDao) {
        return accountDao.getAccounts().stream()
                .max(Comparator.comparing(Account::getBalance))
                .map(Account::getBalance)
                .orElse(BigDecimal.ZERO);
    }
}
