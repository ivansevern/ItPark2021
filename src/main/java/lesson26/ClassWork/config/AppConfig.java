package lesson26.ClassWork.config;

import lesson25.ClassWork.spring.dao.PersonDao;
import lesson25.ClassWork.spring.dao.impl.PersonDaoImpl;
import lesson26.ClassWork.AccountService;
import lesson26.ClassWork.PersonService;
import lesson26.ClassWork.impl.AccountServiceImpl;
import lesson26.ClassWork.impl.PersonServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
@ComponentScan({"lesson25", "lesson26"})
public class AppConfig {

    @Bean("accountService")
    public AccountService accountService() {
        return new AccountServiceImpl(BigDecimal.ONE);
    }

    @Bean("accountService")
    public AccountService accountService1() {
        return new AccountServiceImpl(BigDecimal.ZERO);
    }

    @Bean
    public PersonService personService(/*PersonDao personDao*/) {
//        return new PersonServiceImpl(personDao);
        return new PersonServiceImpl(personDao());
    }

    @Bean
    public PersonDao personDao() {
        return new PersonDaoImpl();
    }
}
