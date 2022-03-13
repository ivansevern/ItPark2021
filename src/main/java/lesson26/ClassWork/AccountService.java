package lesson26.ClassWork;

import java.math.BigDecimal;

public interface AccountService {
    void withdraw(BigDecimal money);
    void deposit(BigDecimal money);

    BigDecimal getCurrentBalance();
}
