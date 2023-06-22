package myplace.core;

import myplace.core.user.MySqlUserRepository;
import myplace.core.user.UserRepository;
import myplace.core.user.UserService;
import myplace.core.user.UserServiceImpl;
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

    @Bean
    public UserService userService() {
        return new UserServiceImpl(userRepository());
    }
}
