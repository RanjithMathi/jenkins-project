package com.tvscs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TvsApplication extends SpringBootServletInitializer {
  
	public static void main(String[] args) {
		SpringApplication.run(TvsApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(TvsApplication.class);
	}

	@GetMapping(value = "/getJenkins")
	public String getjenkins() {
     
		return "jenkins value===>";
	}
}
  
