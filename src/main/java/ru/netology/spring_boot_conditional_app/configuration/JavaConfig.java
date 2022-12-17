package ru.netology.spring_boot_conditional_app.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.spring_boot_conditional_app.profile.DevProfile;
import ru.netology.spring_boot_conditional_app.profile.ProductionProfile;
import ru.netology.spring_boot_conditional_app.profile.SystemProfile;

@Configuration
public class JavaConfig {
    @Bean
    @ConditionalOnProperty(name="netology.profile.dev", havingValue="true", matchIfMissing = true)
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(name="netology.profile.dev", havingValue="false", matchIfMissing = true)
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
