package org.example.config;

import org.example.services.AuditorAwareImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing(auditorAwareRef ="auditorAware")
public class AuditConfig {
    @Bean
    public AuditorAwareImpl auditorAware(){
        return new AuditorAwareImpl();
    }
}
