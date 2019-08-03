package study.config;

import study.entity.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class EntityConfig {

    public EntityConfig() {
        System.out.println("EntityConfig is loading");
    }

    @Bean(name = "user_verlif")
    public User getUser() {
        return new User(1, "Verlif");
    }
}
