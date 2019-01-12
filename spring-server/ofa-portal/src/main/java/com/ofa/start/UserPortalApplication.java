package com.ofa.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan({"com.ofa"})
@EntityScan("com.ofa")
@EnableJpaRepositories("com.ofa")
public class UserPortalApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(UserPortalApplication.class, args);
	}

}

