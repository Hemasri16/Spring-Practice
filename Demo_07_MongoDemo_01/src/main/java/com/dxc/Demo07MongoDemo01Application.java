package com.dxc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dxc.beans.Student;
import com.dxc.repository.StudentRepository;

@SpringBootApplication
public class Demo07MongoDemo01Application implements CommandLineRunner {
	@Autowired
	StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(Demo07MongoDemo01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		studentRepository.save(new Student(100,"Hema"));
		studentRepository.save(new Student(101,"sri"));
		System.out.println("Inserted successfully");
		
		List<Student> students=studentRepository.findAll();
		for(Student student:students) {
			System.out.println(student);
			
		}
		System.out.println();
		System.out.println("Student documents with the name Hema");
		students=studentRepository.getByName("Hema");
		for(Student student:students) {
			System.out.println(student);
			
		}
		System.out.println("\n End of the program");
	}

}
