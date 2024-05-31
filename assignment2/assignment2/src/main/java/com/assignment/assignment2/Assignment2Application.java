package com.assignment.assignment2;

import com.assignment.assignment2.entity.Address;
import com.assignment.assignment2.entity.User;
import com.assignment.assignment2.repository.AddressRepository;
import com.assignment.assignment2.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Assignment2Application implements CommandLineRunner {
	private final UserRepository userRepository;
	private final AddressRepository addressRepository;
	private final Logger LOG = LoggerFactory.getLogger(Assignment2Application.class);
	@Autowired
	public Assignment2Application(UserRepository userRepository, AddressRepository addressRepository) {
		this.userRepository = userRepository;
		this.addressRepository = addressRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(Assignment2Application.class, args);
	}

	public void run(String... args) throws Exception{
//		User user1 = new User();
//		user1.setEmail("user2@gmail.com");
//		user1.setName("User 2");
//		user1.setPassword("333456");
//		userRepository.save(user1);
//		LOG.info("Berhasil menyimpan "+user1);
//
//		Address address1 = new Address();
//		address1.setCity("Jakarta");
//		address1.setCountry("Indonesia");
//		address1.setState("Indonesia");
//		address1.setZip_code("40130");
//		address1.setUserId(user1.getId());
//
//		addressRepository.save(address1);
//		LOG.info("Berhasil menyimpan "+address1);

		userRepository.findAll().forEach(user -> LOG.info(user.getName() + " " + user.getId().toString()));
		addressRepository.findAll().forEach(address -> LOG.info(address.getCity()));
	}

}
