package lesson33.hw33Teacher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"lesson26.hw26Teacher.service", "lesson33.hw33Teacher"})
public class ValuteWebRunner {

    public static void main(String[] args) {
        SpringApplication.run(ValuteWebRunner.class, args);
    }
}
