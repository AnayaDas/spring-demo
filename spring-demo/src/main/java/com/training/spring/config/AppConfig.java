package com.training.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.training.spring.bean.Animal;
import com.training.spring.bean.Car;
import com.training.spring.bean.Cat;
import com.training.spring.bean.Dog;
import com.training.spring.bean.Person;

@Configuration
public class AppConfig {
	
	@Bean("person") 
	public Person getPerson() {
		Person p = new Person();
		p.setFirstName("Samuel");
		p.setLastName("Disuza");
		p.setAge(30);
		return p;
	}
	
	/*@Bean("car")
	public Car getCar() {
		Car c = new Car();
		c.setMake("Honda");
		c.setModel("City");
		c.setYear(2020);
		return c;
		
	}*/
	
	@Bean("animal")
	public Animal getAnimal() {
		Animal a = new Animal();
		a.setName("Tommy");
		a.setAge(4);
		a.setColor("Golden");
		return a;
	}
	
	@Bean("cat")
	public Cat getCat() {
		Cat cat = new Cat("Jimmy", 3, "White", "Indian", 8);
		return cat;
	}
	
	@Bean("dog")
	public Dog getDog() {
		Dog dog = new Dog("Buddy", 5, "Beige", "Labrador", 65);
		return dog;
	}

}
