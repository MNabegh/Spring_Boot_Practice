package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TransactionTutorialApplication {


	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(TransactionConfiguration.class);
		StudentJDBCTemplate studentJDBCTemplate = 
				(StudentJDBCTemplate)context.getBean("studentJDBCTemplate");

		System.out.println("------Records creation--------" );
		studentJDBCTemplate.create("Zara", 11, 99, 2010);
		studentJDBCTemplate.create("Nuha", 20, 97, 2010);
		studentJDBCTemplate.create("Ayan", 25, 100, 2011);

		System.out.println("------Listing all the records--------" );
		List<StudentMarks> studentMarks = studentJDBCTemplate.listStudents();

		for (StudentMarks record : studentMarks) {
			System.out.print("ID : " + record.getId() );
			System.out.print(", Name : " + record.getName() );
			System.out.print(", Marks : " + record.getMarks());
			System.out.print(", Year : " + record.getYear());
			System.out.println(", Age : " + record.getAge());
		}
	}

}
