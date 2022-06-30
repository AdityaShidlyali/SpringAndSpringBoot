package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig2 {

    @Bean
    public MedicalStore beanGetMedicalStore() {
        return new MedicalStore();
    }
}
