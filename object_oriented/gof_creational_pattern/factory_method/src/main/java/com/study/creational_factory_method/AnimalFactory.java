package com.study.creational_factory_method;

public class AnimalFactory implements AnimalFactoryType2 {

	@Override
	public Animal createAnimal(String type) {
		if (type == null) {
			return null;
		}

		if (type.equals("Dog")) {
			return new Dog();
		}

		if (type.equals("Cat")) {
			return new Cat();
		}

		return null;
	}
}
