package org.study.creational_abstract_factory.factory;

import org.study.creational_abstract_factory.component.Button;
import org.study.creational_abstract_factory.component.CheckBox;
import org.study.creational_abstract_factory.component.TextEdit;
import org.study.creational_abstract_factory.component.windows.WindowsButton;
import org.study.creational_abstract_factory.component.windows.WindowsCheckBox;
import org.study.creational_abstract_factory.component.windows.WindowsTextEdit;

public class WindowsFactory implements ComponentFactory {

	@Override
	public Button createButton(String caption) {
		return new WindowsButton(caption);
	}

	@Override
	public CheckBox createCheckBox(boolean checked) {
		return new WindowsCheckBox(checked);
	}

	@Override
	public TextEdit createTextEdit(String value) {
		return new WindowsTextEdit(value);
	}
}
