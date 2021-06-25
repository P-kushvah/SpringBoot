package com.example.bens;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.Interfce.IcourseMterial;

@Component("Studbean")
public class Student {

	@Autowired 
//	@Qualifier("jvBen")
	private IcourseMterial cm ;
	
	Student()
	{System.out.println("Student.Student()");}
	
	public void Disply()
	{
		System.out.println("Student.Disply()");
		
		System.out.println(cm.courseContenct());
		System.out.println(cm.Price());
		
		System.out.println("--Progrme Terminme");
		
	}
	
}
