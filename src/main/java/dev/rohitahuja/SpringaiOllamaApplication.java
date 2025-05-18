package dev.rohitahuja;

import dev.rohitahuja.functions.WeatherConfigProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(WeatherConfigProperties.class)
@SpringBootApplication
public class SpringaiOllamaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringaiOllamaApplication.class, args);
	}

}
