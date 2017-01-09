package com.rajconst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.rajconst.property.controller.PropertyController;


@SpringBootApplication
@EnableJpaRepositories
@EnableConfigurationProperties
public class PropertyServiceApplication 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(PropertyServiceApplication.class, args);
    }
}
