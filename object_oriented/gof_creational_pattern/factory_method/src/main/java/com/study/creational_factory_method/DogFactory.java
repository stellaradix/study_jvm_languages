package com.study.creational_factory_method;

public class DogFactory implements AnimalFactoryType1 {

	@Override
	public Animal createAnimal() {
		return new Dog();
	}
}
