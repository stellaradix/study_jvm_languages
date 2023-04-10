package com.example.oop.creational.abstractfactory.factory;

import com.example.oop.creational.abstractfactory.component.Button;
import com.example.oop.creational.abstractfactory.component.CheckBox;
import com.example.oop.creational.abstractfactory.component.TextEdit;
import com.example.oop.creational.abstractfactory.component.windows.WindowsButton;
import com.example.oop.creational.abstractfactory.component.windows.WindowsCheckBox;
import com.example.oop.creational.abstractfactory.component.windows.WindowsTextEdit;

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
