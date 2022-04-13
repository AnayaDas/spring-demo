package com.training.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.training.spring.bean.Cat;
import com.training.spring.bean.Dog;
import com.training.spring.bean.Person;
import com.training.spring.config.AppConfig;

public class AppTester {
	public static void main(String args[]) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Person p = (Person)context.getBean("person");
		Cat cat = (Cat)context.getBean("cat");
		Dog dog = (Dog)context.getBean("dog");
		System.out.println(p.getAnimalInfo());
		System.out.println(cat.getAnimalInfo());
		System.out.println(dog.getAnimalInfo());
	}

}
