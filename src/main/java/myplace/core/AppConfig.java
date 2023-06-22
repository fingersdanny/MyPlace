package myplace.core;

import myplace.core.user.MySqlUserRepository;
import myplace.core.user.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {
    @Bean
    public UserRepository userRepository() {
        return new MySqlUserRepository();
    }
}
