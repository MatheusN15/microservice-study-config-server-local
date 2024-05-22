package br.com.matheusmn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MicroserviceStudyConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceStudyConfigServerApplication.class, args);
	}

}
