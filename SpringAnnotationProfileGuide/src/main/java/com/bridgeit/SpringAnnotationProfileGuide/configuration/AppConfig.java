package com.bridgeit.SpringAnnotationProfileGuide.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.bridgeit.SpringAnnotationProfileGuide")
public class AppConfig {

	@Autowired
    public DataSource dataSource;
     
}
