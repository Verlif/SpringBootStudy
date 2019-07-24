package study.config;

import study.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EntityConfig {

    public EntityConfig() {
        System.out.println("EntityConfig is loading");
    }

    @Bean(name = "user_verlif")
    User getUser() {
        return new User(1, "Verlif");
    }
}
