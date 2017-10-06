package com.bridgeit.HelloWorld.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

import com.bridgeit.HelloWorld.domain.HelloWorld;
import com.bridgeit.HelloWorld.domain.HelloWorldImpliment;

@Configuration
public class HelloWorldConfig {

	@Bean(name="helloBean")
    @Description("This is a sample HelloWorld Bean")
    public HelloWorld helloWorld() {
        return new HelloWorldImpliment();
    }
}
