package lesson30.ClassWork.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EntityScan("lesson30.model")
public class AppConfig {
}
