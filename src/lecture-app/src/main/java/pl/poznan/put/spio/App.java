package pl.poznan.put.spio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"pl.poznan.put.spio"})
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
