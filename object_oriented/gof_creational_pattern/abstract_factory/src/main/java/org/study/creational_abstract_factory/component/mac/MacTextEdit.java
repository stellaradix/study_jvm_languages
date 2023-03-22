package org.study.creational_abstract_factory.component.mac;

import org.study.creational_abstract_factory.component.TextEdit;

public class MacTextEdit extends TextEdit {

	public MacTextEdit(String value) {
		super(value);
	}

	@Override
	public void render() {
		System.out.println("Mac Rendering API 이용: "
				+ this.value + " 값을 가진 텍스트에디트 그리기");
	}
}
