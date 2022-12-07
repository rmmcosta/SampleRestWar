package com.rmmcosta.Sample.Rest.War;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SampleRestWarApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SampleRestWarApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SampleRestWarApplication.class);
	}
}
