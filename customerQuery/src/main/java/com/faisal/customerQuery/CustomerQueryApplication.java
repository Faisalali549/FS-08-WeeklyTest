package com.faisal.customerQuery;

import com.faisal.customerQuery.dao.StudentRepository;
import com.faisal.customerQuery.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerQueryApplication implements CommandLineRunner {
	@Autowired
	StudentRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(CustomerQueryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student student = new Student();
		student.setFirstName("Faisal");
		student.setLastName("Ali");
		student.setAge(25);
		student.setActive(true);
		repository.save(student);

		student = new Student();
		student.setFirstName("Ali");
		student.setLastName("Akbar");
		student.setAge(43);
		student.setActive(true);
		repository.save(student);

		student = new Student();
		student.setFirstName("Sarwar");
		student.setLastName("Ali");
		student.setAge(31);
		student.setActive(true);
		repository.save(student);

	}
}
