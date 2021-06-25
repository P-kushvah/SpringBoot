/**
 * 
 */
package com.example.bens;

import org.springframework.stereotype.Component;

import com.example.Interfce.IcourseMterial;

/**
 * @author Anita
 *
 */

@Component("jvBen")
public class Jvcourse implements IcourseMterial {

	Jvcourse(){
		System.out.println("Jvcourse.Jvcourse()");
	}
	
	@Override
	public double Price() {
		System.out.println("Jvcourse.Price()");
		return 100;
	}

	@Override
	public String courseContenct() {
	System.out.println("Jvcourse.courseContenct()");
		return "javaCourse:Spring";
	}

}
