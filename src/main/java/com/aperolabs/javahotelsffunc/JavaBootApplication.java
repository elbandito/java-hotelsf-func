package com.aperolabs.javahotelsffunc;

import com.aperolabs.javahotelsffunc.models.PlatformEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class JavaBootApplication {
	@Bean
	public Function<PlatformEvent, String> uppercase() {
		return s -> s.toString();
	}

	public static void main(String[] args) {
		SpringApplication.run(JavaBootApplication.class, args);
	}
}
