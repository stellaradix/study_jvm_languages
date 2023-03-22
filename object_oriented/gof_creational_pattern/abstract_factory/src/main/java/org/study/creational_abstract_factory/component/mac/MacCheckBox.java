package org.study.creational_abstract_factory.component.mac;

import org.study.creational_abstract_factory.component.CheckBox;

public class MacCheckBox extends CheckBox {

	public MacCheckBox(boolean checked) {
		super(checked);
	}

	@Override
	public void render() {
		System.out.println("Mac Rendering API 이용: "
				+ (this.checked ? "체크된" : "체크 안 된") + " 체크박스 그리기");
	}
}
