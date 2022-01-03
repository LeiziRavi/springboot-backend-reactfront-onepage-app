package com.app.ravi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.ravi.model.User;
import com.app.ravi.repository.UserRepository;

@SpringBootApplication
public class SpringBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBackendApplication.class, args);
	}
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception{
		this.userRepository.save(new User("Ravi", "Choudhary", "ravic@gmail.com"));
		this.userRepository.save(new User("Sanju", "Utane", "sanju@gmail.com"));
		this.userRepository.save(new User("Chetan", "Chouhan", "chetan@gmail.com"));
		this.userRepository.save(new User("Hiren", "Jadhav", "hiren@gmail.com"));
	}
}
