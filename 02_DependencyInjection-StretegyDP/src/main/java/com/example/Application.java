package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.bens.Student;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		
		Student st = ctx.getBean("Studbean",Student.class);
		
		st.Disply();
		
		System.out.println("Min end");
	}

}
