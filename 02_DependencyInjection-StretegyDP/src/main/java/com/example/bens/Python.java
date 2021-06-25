/**
 * 
 */
package com.example.bens;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.Interfce.IcourseMterial;

/**
 * @author Anita
 *
 */
@Component("Pyben")
@Primary
public class Python implements IcourseMterial {
	
	Python(){System.out.println("Python.Python()");}

	@Override
	public double Price() {
		System.out.println("Python.Price()");
		return 300;
	}

	@Override
	public String courseContenct() {
		System.out.println("Python.courseContenct()");
		return "python:lumphy & pandas";
	}

}
