package poc.spring.arm.springsecurity.config.security;

import jakarta.annotation.security.PermitAll;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeHttpRequests((authorize) -> {
            authorize.requestMatchers("/").permitAll();
            authorize.requestMatchers("/api/news/**").hasRole("ADMIN");
            authorize.anyRequest().authenticated();
        }).csrf(AbstractHttpConfigurer::disable).httpBasic(Customizer.withDefaults());

        return httpSecurity.build();
    }
}
