package com.study.creational_factory_method;

public class CatFactory implements AnimalFactoryType1 {

	@Override
	public Animal createAnimal() {
		return new Cat();
	}
}
