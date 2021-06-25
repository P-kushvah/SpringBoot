package com.example;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.example.ben.Wish;

@SpringBootApplication
public class Application {

	@Bean // Pre-defined class methods initilization
	public LocalDateTime datetimeDemo() {
		System.out.println("Locl object creted");
		LocalDateTime dt = LocalDateTime.now();
		System.out.println("Locl object is" + dt);
		return dt;
	}

	/*@Bean(name = "myDt1")
	public LocalDateTime datetimeDemo1() {
		System.out.println("Locl object creted");
		LocalDateTime dt = LocalDateTime.now();
		System.out.println("Locl object is" + dt);
		return dt;
	}*/

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(Application.class, args);

		Wish w = ctx.getBean("WishId", Wish.class);
		System.out.println("wishId creted");

		w.Disply();
		System.out.println("Disply");

		((ConfigurableApplicationContext) ctx).close();
	}

}
