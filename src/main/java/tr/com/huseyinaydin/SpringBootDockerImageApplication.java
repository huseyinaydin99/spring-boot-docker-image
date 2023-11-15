package tr.com.huseyinaydin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerImageApplication {

	@GetMapping("/")
	public String apply(){
		return "Docker image'ı inşa edildi ve çalıştırıldı. Ayağa kaldırıldı. Up oldu.";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerImageApplication.class, args);
	}

}
