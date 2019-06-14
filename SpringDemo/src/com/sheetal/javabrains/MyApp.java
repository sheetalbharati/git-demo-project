package com.sheetal.javabrains;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class MyApp {

	public static void main(String args[]){
		//Triangle triale = new Triangle();
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangle  t = (Triangle)factory.getBean("traingle");
		t.drawShape();
	}
}
