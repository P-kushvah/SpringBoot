package com.example.bens;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.Interfce.IcourseMterial;

@Component("DnetBen")

public class DotNet implements IcourseMterial {
 	
	DotNet(){System.out.println("DotNet.DotNet()");}

	@Override
	public double Price() {
		System.out.println("DotNet.Price()");
		return 200;
	}

	@Override
	public String courseContenct() {
		System.out.println("DotNet.courseContenct()");
		return "DotNEt: C#";
	}

}
