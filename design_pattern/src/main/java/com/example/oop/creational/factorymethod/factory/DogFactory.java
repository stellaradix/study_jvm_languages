package com.example.oop.creational.factorymethod.factory;

import com.example.oop.creational.factorymethod.model.Animal;
import com.example.oop.creational.factorymethod.model.Dog;

public class DogFactory implements AnimalFactory {

	@Override
	public Animal createAnimal() {
		return new Dog();
	}
}
