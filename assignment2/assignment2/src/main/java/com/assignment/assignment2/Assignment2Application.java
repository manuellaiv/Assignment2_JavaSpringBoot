package com.assignment.assignment2;

import com.assignment.assignment2.entity.Address;
import com.assignment.assignment2.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Assignment2Application implements CommandLineRunner {
	private final Logger LOG = LoggerFactory.getLogger(Assignment2Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Assignment2Application.class, args);
	}

	public void run(String... args) throws Exception{
		User user1 = new User();
		user1.setEmail("user1@gmail.com");
		user1.setName("User 1");
		user1.setPassword("123456");

		Address address1 = new Address();
		address1.setCity("Bandung");
		address1.setCountry("Indonesia");
		address1.setState("Indonesia");
		address1.setZip_code("40136");
		address1.setUserId(user1.getId());

		LOG.info("Berhasil menyimpan "+user1);
		LOG.info("Berhasil menyimpan "+address1);
	}

}
