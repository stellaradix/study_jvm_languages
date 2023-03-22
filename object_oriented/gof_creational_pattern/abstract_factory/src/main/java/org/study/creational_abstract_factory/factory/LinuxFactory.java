package org.study.creational_abstract_factory.factory;

import org.study.creational_abstract_factory.component.Button;
import org.study.creational_abstract_factory.component.CheckBox;
import org.study.creational_abstract_factory.component.TextEdit;
import org.study.creational_abstract_factory.component.linux.LinuxButton;
import org.study.creational_abstract_factory.component.linux.LinuxCheckBox;
import org.study.creational_abstract_factory.component.linux.LinuxTextEdit;

public class LinuxFactory implements ComponentFactory {

	@Override
	public Button createButton(String caption) {
		return new LinuxButton(caption);
	}

	@Override
	public CheckBox createCheckBox(boolean checked) {
		return new LinuxCheckBox(checked);
	}

	@Override
	public TextEdit createTextEdit(String value) {
		return new LinuxTextEdit(value);
	}
}
