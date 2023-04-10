package com.example.oop.creational.abstractfactory.factory;

import com.example.oop.creational.abstractfactory.component.Button;
import com.example.oop.creational.abstractfactory.component.CheckBox;
import com.example.oop.creational.abstractfactory.component.TextEdit;

public interface ComponentFactory {

	Button createButton(String caption);

	CheckBox createCheckBox(boolean checked);

	TextEdit createTextEdit(String value);
}
