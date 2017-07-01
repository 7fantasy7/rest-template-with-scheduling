package by.botyanov.scheduledrestmongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@PropertySource(value = {"classpath:application.properties", "classpath:secret.properties"})
@EnableScheduling
@EnableMongoRepositories
public class ZaimixUptimeRobotApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZaimixUptimeRobotApplication.class, args);
    }

}
