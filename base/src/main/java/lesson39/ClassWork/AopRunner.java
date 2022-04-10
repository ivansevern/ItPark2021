package lesson39.ClassWork;

import lesson18.ClassWork.dto.Person;
import lesson39.ClassWork.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@Slf4j
//@EnableCaching(12)
@SpringBootApplication
public class AopRunner {

    public static void main(String[] args) {
        final ConfigurableApplicationContext applicationContext =
                SpringApplication.run(AopRunner.class, args);
        final PersonService personService = applicationContext.getBean(PersonService.class);
        final Person ivanov = personService.getByName("Ivanov");
        log.info("Имя персоны {}", personService.getName());
    }
}
