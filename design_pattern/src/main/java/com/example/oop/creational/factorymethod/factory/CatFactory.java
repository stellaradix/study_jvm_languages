package com.example.oop.creational.factorymethod.factory;

import com.example.oop.creational.factorymethod.model.Animal;
import com.example.oop.creational.factorymethod.model.Cat;

public class CatFactory implements AnimalFactory {

	@Override
	public Animal createAnimal() {
		return new Cat();
	}
}
