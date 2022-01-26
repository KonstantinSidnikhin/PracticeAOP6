package com.sidnikhin.spring.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.sidnikhin.spring.app")
@EnableAspectJAutoProxy
public class MyConfig {
}
