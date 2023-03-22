import com.study.creational_factory_method.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactoryMethodTest {

	@Test
	@DisplayName("Factory Method - DogFactory")
	public void testDogFactoryMethod() {
		AnimalFactoryType1 dogFactory = new DogFactory();
		Animal dog = dogFactory.createAnimal();
		assertEquals(dog.speak(), "멍멍!");
	}

	@Test
	@DisplayName("Factory Method - CatFactory")
	public void testCatFactoryMethod() {
		AnimalFactoryType1 catFactory = new CatFactory();
		Animal cat = catFactory.createAnimal();
		assertEquals(cat.speak(), "야옹!");
	}

	@Test
	@DisplayName("Factory Method - AnimalFactory: Dog")
	public void testDogFactoryMethod2() {
		AnimalFactoryType2 animalFactory = new AnimalFactory();
		Animal dog = animalFactory.createAnimal("Dog");
		assertEquals(dog.speak(), "멍멍!");
	}

	@Test
	@DisplayName("Factory Method - AnimalFactory: Cat")
	public void testCatFactoryMethod2() {
		AnimalFactoryType2 animalFactory = new AnimalFactory();
		Animal cat = animalFactory.createAnimal("Cat");
		assertEquals(cat.speak(), "야옹!");
	}
}

/* Factory Method 패턴
- 객체 생성을 하위 클래스에 위임하여 객체 생성의 유연성과 확장성을 높이는 패턴

장점:
- 객체 생성 코드를 별도의 클래스로 분리하여 코드 유지보수성을 향상
- 객체 생성 방식에 대한 유연성을 제공. 새로운 객체 생성 방식이 필요한 경우 새로운 하위 클래스를 작성하여 구현.
- 객체 생성에 대한 중복 코드를 제거. 객체 생성 코드를 공통적으로 관리하여 중복을 제거.
- 인터페이스와 구현 사이의 결합도를 낮춤. 객체 생성 로직을 캡슐화하여 인터페이스와 구현 사이의 결합도를 낮출 수 있다.

단점:
- 객체 생성에 대한 클래스 수가 증가합니다. 하위 클래스를 많이 만들어야 하므로 클래스 수가 증가할 수 있습니다.
- 객체 생성을 위해 추가적인 메모리를 사용할 수 있습니다. 객체 생성을 위한 추가적인 클래스 및 메모리 사용이 필요합니다.
- 구현 방식이 너무 복잡해질 수 있습니다. 객체 생성 방식이 복잡한 경우, Factory Method 패턴을 사용하면 구현 방식이 더욱 복잡해질 수 있습니다.

특징
- 추상 팩토리 패턴과 함께 사용될 수 있습니다. 추상 팩토리 패턴에서는 관련성 있는 객체들을 생성할 때 Factory Method 패턴을 사용 가능.
- 생성된 객체를 캐싱할 수 있습니다. Factory Method 패턴을 사용하면 생성된 객체를 캐싱하여 성능 향상을 기대할 수 있습니다.
- 생성된 객체가 다른 객체와 의존성을 가질 수 있습니다. 객체 생성 과정에서 생성된 객체가 다른 객체와 의존성을 가질 수 있습니다.
이 경우 의존성을 처리하기 위해 DI(Dependency Injection) 패턴을 사용할 수 있습니다.

*/