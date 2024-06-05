package com.example.employeeservice.config;

import com.example.employeeservice.feign.AddressClient;
import feign.Client;
import org.modelmapper.ModelMapper;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableFeignClients
//@EnableFeignClients(basePackages = {"com.example.employeeservice.feign"})
public class EmployeeConfig {

    @Bean
    public ModelMapper modelMapperBean() {
        return new ModelMapper();
    }

}
