package br.com.uscsitau.uscsitau;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@EnableCassandraRepositories
@SpringBootApplication
public class UscsitauApplication {

	public static void main(String[] args) {
		SpringApplication.run(UscsitauApplication.class, args);
	}

}
