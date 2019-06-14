package com.sheetal.javabrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String args[]){
		//Triangle triale = new Triangle();
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle  t = (Triangle)context.getBean("traingle");
		t.drawShape();
	}
}
