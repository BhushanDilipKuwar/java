package com.example.mappingProject.Service;



import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.mappingProject.Entity.User;
import com.example.mappingProject.Repository.UserRepository;

@Component
public class UserService implements CommandLineRunner {

	private final UserRepository userRepo;

	public UserService(UserRepository userRepo) {
		this.userRepo = userRepo;
	}

	@Override
	public void run(String... args) {
		User user1 = new User("Alice", new Profile("alice@example.com"));
		User user2 = new User("Bob", new Profile("bob@example.com"));
		userRepo.save(user1);
		userRepo.save(user2);
	}
}