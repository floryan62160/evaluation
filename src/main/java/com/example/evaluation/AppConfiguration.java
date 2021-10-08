package com.example.evaluation;

import com.example.evaluation.repositories.InfirmiereRepository;
import com.example.evaluation.services.InfirmiereService;
import com.example.evaluation.services.InfirmiereServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    @Bean
    public InfirmiereService infirmiereService(InfirmiereRepository infiermiereRepository){
        return new InfirmiereServiceImpl(infiermiereRepository);
    }
}
