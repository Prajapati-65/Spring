package com.bridgeit.SpringAnnotationProfileGuide.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Profile("Development")
@Configuration
public class DevDatabaseConfig implements DatabaseConfig {
 
    @Override
    @Bean
    public DataSource createDataSource() {
        System.out.println("Creating development database");
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
       
        return dataSource;
    }
 
}