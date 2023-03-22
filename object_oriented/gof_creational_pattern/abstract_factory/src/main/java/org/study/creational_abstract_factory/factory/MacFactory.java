package org.study.creational_abstract_factory.factory;

import org.study.creational_abstract_factory.component.Button;
import org.study.creational_abstract_factory.component.CheckBox;
import org.study.creational_abstract_factory.component.TextEdit;
import org.study.creational_abstract_factory.component.mac.MacButton;
import org.study.creational_abstract_factory.component.mac.MacCheckBox;
import org.study.creational_abstract_factory.component.mac.MacTextEdit;

public class MacFactory implements ComponentFactory {

	@Override
	public Button createButton(String caption) {
		return new MacButton(caption);
	}

	@Override
	public CheckBox createCheckBox(boolean checked) {
		return new MacCheckBox(checked);
	}

	@Override
	public TextEdit createTextEdit(String value) {
		return new MacTextEdit(value);
	}
}
