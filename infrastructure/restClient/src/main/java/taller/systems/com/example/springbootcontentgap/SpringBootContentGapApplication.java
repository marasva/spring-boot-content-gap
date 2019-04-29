package taller.systems.com.example.springbootcontentgap;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class SpringBootContentGapApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootContentGapApplication.class, args);
	}

}
