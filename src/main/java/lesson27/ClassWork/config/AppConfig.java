package lesson27.ClassWork.config;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import java.sql.Connection;
import java.sql.DriverManager;

@Configuration
@ComponentScan("lesson27")
@PropertySource("classpath:db.properties")
public class AppConfig {

//    private Properties properties;
//
//    public AppConfig() throws Exception {
//        this.properties = new Properties();
//        this.properties.load(AppConfig.class.getResourceAsStream("/db.properties"));
//    }
//
//    @Bean
//    @SneakyThrows
//    Connection connection() {
//        return DriverManager.getConnection(properties.getProperty("jdbc.url"),
//                properties.getProperty("db.login"), properties.getProperty("db.password"));
//    }

    @Scope("prototype")
    @Bean(destroyMethod = "close")
    @SneakyThrows
    Connection connection(@Value("${jdbc.url}") String jdbcUrl,
                          @Value("${db.login}") String login,
                          @Value("${db.password}") String password) {
        return DriverManager.getConnection(jdbcUrl, login, password);
    }
}
