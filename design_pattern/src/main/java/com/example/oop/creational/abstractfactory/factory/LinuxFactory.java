package com.example.oop.creational.abstractfactory.factory;

import com.example.oop.creational.abstractfactory.component.Button;
import com.example.oop.creational.abstractfactory.component.CheckBox;
import com.example.oop.creational.abstractfactory.component.TextEdit;
import com.example.oop.creational.abstractfactory.component.linux.LinuxButton;
import com.example.oop.creational.abstractfactory.component.linux.LinuxCheckBox;
import com.example.oop.creational.abstractfactory.component.linux.LinuxTextEdit;

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
