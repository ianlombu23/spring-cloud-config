package com.woyo.spring.cloud.config.mstestconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = {AccountsContactInfoDTO.class})
public class MsTestConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsTestConfigApplication.class, args);
	}

}
