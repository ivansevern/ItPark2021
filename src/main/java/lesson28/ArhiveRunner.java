package lesson28;

/*
1. С помощью Spring Boot реализовать приложение-архиватор, который получает от пользователя расположение до файла,
который предполагается сжать/заархивировать, используя встроенные возможности Java (из пакета java.util.zip)
или полагаясь на сторонние библиотеки (например, zip4j).
2. Наряду с архивацией также предлагается добавить возможность разархивирования файлов.
3*. Поддержать возможность разархивации «запароленного» архива.
*/

import com.fasterxml.jackson.databind.ObjectMapper;
import lesson28.service.Arhiv;
import lesson28.service.PrintService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication ////для запуска спинг бут приложений
public class ArhiveRunner {

    public static void main(String[] args) {
        final ConfigurableApplicationContext appContext = SpringApplication.run(ArhiveRunner.class, args);//для запуска спинг бут приложений
        final Arhiv arhiv = appContext.getBean(Arhiv.class);
        arhiv.packaged();

        final PrintService printService = appContext.getBean(PrintService.class);
    }

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }
}
