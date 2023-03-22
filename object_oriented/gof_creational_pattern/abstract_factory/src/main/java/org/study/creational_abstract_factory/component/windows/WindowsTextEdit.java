package org.study.creational_abstract_factory.component.windows;

import org.study.creational_abstract_factory.component.TextEdit;

public class WindowsTextEdit extends TextEdit {

	public WindowsTextEdit(String value) {
		super(value);
	}

	@Override
	public void render() {
		System.out.println("Windows Rendering API 이용: "
				+ this.value + " 값을 가진 텍스트에디트 그리기");
	}
}
