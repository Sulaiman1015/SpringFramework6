package com.sm.validation.byMethod;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

@Configuration
@ComponentScan("com.sm.validation.byMethod")
public class ValidationConfigMethod {
    @Bean
    public MethodValidationPostProcessor validationPostProcessor(){
        return new MethodValidationPostProcessor();
    }
}
