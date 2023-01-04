package org.dmace.demos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.datatables.repository.DataTablesRepositoryFactoryBean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class SpringBootTestingPrimerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTestingPrimerApplication.class, args);
	}

}
