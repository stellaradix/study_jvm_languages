package com.example.oop.creational.abstractfactory;

import com.example.oop.creational.abstractfactory.component.Button;
import com.example.oop.creational.abstractfactory.component.CheckBox;
import com.example.oop.creational.abstractfactory.component.TextEdit;
import com.example.oop.creational.abstractfactory.component.linux.LinuxButton;
import com.example.oop.creational.abstractfactory.component.linux.LinuxCheckBox;
import com.example.oop.creational.abstractfactory.component.linux.LinuxTextEdit;
import com.example.oop.creational.abstractfactory.component.mac.MacButton;
import com.example.oop.creational.abstractfactory.component.mac.MacCheckBox;
import com.example.oop.creational.abstractfactory.component.mac.MacTextEdit;
import com.example.oop.creational.abstractfactory.component.windows.WindowsButton;
import com.example.oop.creational.abstractfactory.component.windows.WindowsCheckBox;
import com.example.oop.creational.abstractfactory.component.windows.WindowsTextEdit;
import com.example.oop.creational.abstractfactory.factory.ComponentFactory;
import com.example.oop.creational.abstractfactory.factory.LinuxFactory;
import com.example.oop.creational.abstractfactory.factory.MacFactory;
import com.example.oop.creational.abstractfactory.factory.WindowsFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * <p>
 * OOP > 디자인 패턴 > 생성 패턴 > Abstract Factory<br>
 * - 객체의 생성을 추상화 > 동일한 인터페이스를 사용하여 객체를 생성<br>
 * - Factory Method 를 확장한 것<br>
 * - Factory Method 는 하나의 객체를 만들 때 사용,
 * Abstract Factory 는 여러개의 관련 객체를 만들 때 사용<br>
 * - 서로 연관된 객체를 일관성있게 생성 > 코드의 유지보수성과 확장성 향상<br>
 * - Abstract Factory: 객체를 생성하는 인터페이스 제공<br>
 * - Concrete Factory: 실제 객체를 생성하는 역할 수행<br>
 * </p>
 * <p>
 * 추상 팩토리 장점<br>
 * - 객체 생성 코드와 사용 코드를 분리 > 유연성 향상<br>
 * - 객체 생성 코드 중앙 집중화 > 코드의 재사용성 향상<br>
 * - 객체 생성 코드 추상화 > 새로운 구현체 추가 용이<br>
 * - 클라이언트 코드의 의존성 하락 > 객체 구현체 교체 용이<br>
 * - 추상화된 인터페이스 사용 > 코드 유지보수 용이<br>
 * </p>
 * <p>
 * 추상 팩토리 단점<br>
 * - 새로운 제품을 추가하기 위해 추상 팩토리와 모든 구체 팩토리를 수정 필요<br>
 * - 복잡한 디자인 패턴 > 코드가 어려워질 가능성<br>
 * - 추상화된 팩토리 인터페이스를 유지 어려움, 추가적인 비용 발생 가능성<br>
 * </p>
 */
public class AbstractFactoryTests {

	@Test
	public void testLinuxFactory() {
		ComponentFactory factory = new LinuxFactory();

		Button button = factory.createButton("리눅스 버튼");
		assertEquals(button.getClass(), LinuxButton.class);

		CheckBox checkBox = factory.createCheckBox(false);
		assertEquals(checkBox.getClass(), LinuxCheckBox.class);

		TextEdit textEdit = factory.createTextEdit("글자 입력");
		assertEquals(textEdit.getClass(), LinuxTextEdit.class);
	}

	@Test
	public void testMacFactory() {
		ComponentFactory factory = new MacFactory();

		Button button = factory.createButton("맥 버튼");
		assertEquals(button.getClass(), MacButton.class);

		CheckBox checkBox = factory.createCheckBox(true);
		assertEquals(checkBox.getClass(), MacCheckBox.class);

		TextEdit textEdit = factory.createTextEdit("글자 입력");
		assertEquals(textEdit.getClass(), MacTextEdit.class);
	}

	@Test
	public void testWindowsFactory() {
		ComponentFactory factory = new WindowsFactory();

		Button button = factory.createButton("맥 버튼");
		assertEquals(button.getClass(), WindowsButton.class);

		CheckBox checkBox = factory.createCheckBox(true);
		assertEquals(checkBox.getClass(), WindowsCheckBox.class);

		TextEdit textEdit = factory.createTextEdit("글자 입력");
		assertEquals(textEdit.getClass(), WindowsTextEdit.class);
	}
}
