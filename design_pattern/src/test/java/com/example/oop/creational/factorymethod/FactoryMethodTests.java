package com.example.oop.creational.factorymethod;

import com.example.oop.creational.factorymethod.factory.AnimalFactory;
import com.example.oop.creational.factorymethod.factory.CatFactory;
import com.example.oop.creational.factorymethod.factory.DogFactory;
import com.example.oop.creational.factorymethod.model.Animal;
import com.example.oop.creational.factorymethod.model.Cat;
import com.example.oop.creational.factorymethod.model.Dog;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

/**
 * <p>
 * OOP > 디자인 패턴 > 생성 패턴 > Factory Method<br>
 * - 객체 생성을 하위 클래스에 위임: 유연성과 확장성 증대<br>
 * </p>
 * <p>
 * 팩토리 메서드 장점<br>
 * - 객체 생성 코드를 별도의 클래스로 분리: 유지보수성 향상<br>
 * - 새로운 객체 생성 방식이 필요한 경우: 새로운 하위 클래스 구현 (유연성 증가)<br>
 * - 객체 생성 코드를 공통 관리: 중복 제거<br>
 * - 객체 생성 로직 캡슐화: 인터페이스와 구현 사이 결합도 저하<br>
 * </p>
 * <p>
 * 팩토리 메서드 단점<br>
 * - 객체 생성에 대한 클래스 수 증가<br>
 * - 객체 생성을 위해 추가적인 메모리 사용 가능성 증가<br>
 * - 구현 방식이 너무 복잡해질 가능성 증가<br>
 * </p>
 * <p>
 * 팩토리 메서드 특징<br>
 * - 추상 팩토리 패턴과 함께 사용 가능<br>
 * - 관련성 있는 객체 생성시 사용<br>
 * - 생성된 객체 캐싱: 성능 향상 기대<br>
 * - 생성 과정에서 생성된 객체가 다른 객체와 의존성 가질 가능성 증가<br>
 * </p>
 */
public class FactoryMethodTests {

	@Test
	@DisplayName("팩토리 메서드 테스트 1")
	public void testCreateDog() {
		AnimalFactory factory = new DogFactory();
		Animal dog = factory.createAnimal();

		assertInstanceOf(Dog.class, dog);
		assertEquals(dog.speak(), "멍멍");
	}

	@Test
	@DisplayName("팩토리 메서드 테스트 2")
	public void testCreateCat() {
		AnimalFactory factory = new CatFactory();
		Animal cat = factory.createAnimal();

		assertInstanceOf(Cat.class, cat);
		assertEquals(cat.speak(), "야옹");
	}
}
