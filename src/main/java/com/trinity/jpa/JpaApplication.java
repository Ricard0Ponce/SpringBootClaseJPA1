package com.trinity.jpa;

//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//import com.trinity.jpa.data.AuthorRepository;
//import com.trinity.jpa.models.Author;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	// El siguiente metodo me permite realizar una prueba al inyectar datos a la BD
	// A esto se le llama "Transaccion"
	// @Bean // LOs beans siempre se usan en metodos publicos
	/*
	 * public CommandLineRunner commandLineRunner(
	 * AuthorRepository repository
	 * ){
	 * return args -> {
	 * var author = Author.builder()
	 * .firtsname("Ricardo")
	 * .lastName("Ponce")
	 * .age(22)
	 * .email("ricardoponc@gmail.com")
	 * .build();
	 * repository.save(author);
	 * };
	 * }
	 */

}
