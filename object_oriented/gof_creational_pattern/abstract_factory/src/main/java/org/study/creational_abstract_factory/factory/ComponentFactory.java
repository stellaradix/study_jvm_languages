package org.study.creational_abstract_factory.factory;

import org.study.creational_abstract_factory.component.Button;
import org.study.creational_abstract_factory.component.CheckBox;
import org.study.creational_abstract_factory.component.TextEdit;

public interface ComponentFactory {

	Button createButton(String caption);

	CheckBox createCheckBox(boolean checked);

	TextEdit createTextEdit(String value);
}
