package org.study.creational_abstract_factory;

import org.junit.jupiter.api.Test;
import org.study.creational_abstract_factory.component.Button;
import org.study.creational_abstract_factory.component.CheckBox;
import org.study.creational_abstract_factory.component.TextEdit;
import org.study.creational_abstract_factory.component.linux.LinuxButton;
import org.study.creational_abstract_factory.component.linux.LinuxCheckBox;
import org.study.creational_abstract_factory.component.linux.LinuxTextEdit;
import org.study.creational_abstract_factory.component.mac.MacButton;
import org.study.creational_abstract_factory.component.mac.MacCheckBox;
import org.study.creational_abstract_factory.component.mac.MacTextEdit;
import org.study.creational_abstract_factory.component.windows.WindowsButton;
import org.study.creational_abstract_factory.component.windows.WindowsCheckBox;
import org.study.creational_abstract_factory.component.windows.WindowsTextEdit;
import org.study.creational_abstract_factory.factory.ComponentFactory;
import org.study.creational_abstract_factory.factory.LinuxFactory;
import org.study.creational_abstract_factory.factory.MacFactory;
import org.study.creational_abstract_factory.factory.WindowsFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AbstractFactoryTest {

	@Test
	public void testWindowsComponentFactory() {
		ComponentFactory factory = new WindowsFactory();

		Button button = factory.createButton("확인");
		CheckBox checkBox = factory.createCheckBox(false);
		TextEdit textEdit = factory.createTextEdit("디자인 패턴");

		assertTrue(button instanceof WindowsButton);
		assertTrue(checkBox instanceof WindowsCheckBox);
		assertTrue(textEdit instanceof WindowsTextEdit);
	}

	@Test
	public void testLinuxComponentFactory() {
		ComponentFactory factory = new LinuxFactory();

		Button button = factory.createButton("취소");
		CheckBox checkBox = factory.createCheckBox(true);
		TextEdit textEdit = factory.createTextEdit("추상 팩토리 패턴");

		assertTrue(button instanceof LinuxButton);
		assertTrue(checkBox instanceof LinuxCheckBox);
		assertTrue(textEdit instanceof LinuxTextEdit);
	}

	@Test
	public void testMacComponentFactory() {
		ComponentFactory factory = new MacFactory();

		Button button = factory.createButton("취소");
		CheckBox checkBox = factory.createCheckBox(true);
		TextEdit textEdit = factory.createTextEdit("추상 팩토리 패턴");

		assertTrue(button instanceof MacButton);
		assertTrue(checkBox instanceof MacCheckBox);
		assertTrue(textEdit instanceof MacTextEdit);
	}
}

/* Abstract Factory 패턴

- 추상적인 것들을 만드는 공장
- 만들어야 할 컴포넌트들을 추상적으로 정하고, 구체적인 상황이 주어지면 각 컴포넌트들을 구체적으로 만드는 패턴

장점:
- 객체 생성 코드와 사용 코드를 분리하여 유연성을 높입니다.
- 객체 생성에 필요한 코드를 중앙 집중화하여 코드의 재사용성을 높입니다.
- 객체 생성 코드를 추상화하여, 새로운 구현체를 추가하기 쉬워집니다.
- 클라이언트 코드는 구체적인 클래스를 알 필요가 없기 때문에, 객체의 구현체를 쉽게 교체할 수 있습니다.
- 추상화된 인터페이스를 사용하기 때문에, 코드의 유지보수가 용이합니다.

단점:
- 새로운 제품을 추가하기 위해서는 추상 팩토리와 모든 구체 팩토리를 수정해야 합니다.
- 복잡한 디자인 패턴으로 인해 코드가 어려울 수 있습니다.
- 추상화된 팩토리 인터페이스를 유지하기 위해 노력해야 하며, 이에 대한 추가적인 비용이 발생할 수 있습니다.

*/
