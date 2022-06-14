package pl.proteingeekbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ProteinGeekBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProteinGeekBackendApplication.class, args);
    }

}
