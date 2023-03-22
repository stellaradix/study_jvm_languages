package org.study.creational_abstract_factory.component.linux;

import org.study.creational_abstract_factory.component.TextEdit;

public class LinuxTextEdit extends TextEdit {

	public LinuxTextEdit(String value) {
		super(value);
	}

	@Override
	public void render() {
		System.out.println("Linux Rendering API 이용: "
				+ this.value + " 값을 가진 텍스트에디트 그리기");
	}
}
