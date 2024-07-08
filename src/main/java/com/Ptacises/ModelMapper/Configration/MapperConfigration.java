package com.Ptacises.ModelMapper.Configration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfigration {

    @Bean
    ModelMapper mymodel(){
        return new ModelMapper();
    }

}
