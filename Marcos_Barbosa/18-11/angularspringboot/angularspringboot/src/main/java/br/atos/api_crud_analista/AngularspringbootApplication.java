package br.atos.api_crud_analista;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class AngularspringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AngularspringbootApplication.class, args);
	}

}
