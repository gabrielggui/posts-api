package uol.compass.challenge3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableFeignClients
@EnableScheduling
@SpringBootApplication
public class Challenge3Application {

	public static void main(String[] args) {
		SpringApplication.run(Challenge3Application.class, args);
		
	}

}
