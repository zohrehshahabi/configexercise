package com.exercise.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:dbConfig.properties")
public class DbConfiguration {
@Autowired
    Environment env;

    @Override
    public String toString() {
        return "user:"+env.getProperty("user")+",password:"+env.getProperty("password");
    }
}
