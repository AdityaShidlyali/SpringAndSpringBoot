package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example"}) // we can provide array of packages for ComponentScan
public class BeanConfig {

}
