package com.example.ben;

import java.time.LocalDateTime;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("WishId")  //provides SPringBean id for curfrent class 


public class Wish {
	@Autowired    //will  inject value from any class method having same return type  
	//@Qualifier("myDt1")
	private LocalDateTime dt;
	
	 Wish()
	{
		System.out.println("wish constructor");
	}
	
	public void Disply() {
		int hrs = dt.getHour();

		System.out.println("inside Disply method");
		
		if (hrs < 12) {
			System.out.println("Hii.....Gd morning");
		} else if (hrs < 16) {
			System.out.println("Hiii......Gd fternnon");
		} else if (hrs < 18) {
			System.out.println("Hi.....Gd eveing");
		} else {
			System.out.println("Hii......night");
		}
	}

}
