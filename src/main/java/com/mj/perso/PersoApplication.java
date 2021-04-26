package com.mj.perso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.mj.perso"})
public class PersoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersoApplication.class, args);
	}

}
