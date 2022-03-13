package lesson30.ClassWork;

import lesson30.ClassWork.model.Author;
import lesson30.ClassWork.service.AuthorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JpaRunner {

    public static void main(String[] args) {
        final ConfigurableApplicationContext applicationContext = SpringApplication.run(JpaRunner.class, args);
        final AuthorService authorService = applicationContext.getBean(AuthorService.class);
        authorService.save(new Author("Виталий", "Иванов"));
    }
}
