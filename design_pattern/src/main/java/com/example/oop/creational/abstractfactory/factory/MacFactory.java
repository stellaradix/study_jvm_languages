package com.example.oop.creational.abstractfactory.factory;

import com.example.oop.creational.abstractfactory.component.Button;
import com.example.oop.creational.abstractfactory.component.CheckBox;
import com.example.oop.creational.abstractfactory.component.TextEdit;
import com.example.oop.creational.abstractfactory.component.mac.MacButton;
import com.example.oop.creational.abstractfactory.component.mac.MacCheckBox;
import com.example.oop.creational.abstractfactory.component.mac.MacTextEdit;

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
