package com.project1;

import com.project1.Entity.Student;
import com.project1.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;



//	@Override
//	public void run(String... args) throws Exception {
//         Student student1= new Student("Akash","Tiwari","at754@gmail.com");
//		 studentRepository.save(student1);
//
//		Student student2= new Student("Shambhavi","Gaur","shambhavigaur12@gmail.com");
//		studentRepository.save(student2);
//
//		Student student3= new Student("Shailee","Mishra","shaileeMishra12@gmail.com");
//		studentRepository.save(student3);
//
//	}
}
