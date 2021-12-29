package com.mavenspring.SpringTest004_Core_PerformerApp2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.mavenspring.SpringTest004_Core_PerformerApp2")
public class AppConfig {
	
	@Bean
	public String getName() {
		return "Hariprasad Chaurasia";
	}
}
