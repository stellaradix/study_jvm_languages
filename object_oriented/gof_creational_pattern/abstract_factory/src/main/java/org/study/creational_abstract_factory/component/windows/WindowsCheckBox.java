package org.study.creational_abstract_factory.component.windows;

import org.study.creational_abstract_factory.component.CheckBox;

public class WindowsCheckBox extends CheckBox {

	public WindowsCheckBox(boolean checked) {
		super(checked);
	}

	@Override
	public void render() {
		System.out.println("Windows Rendering API 이용: "
				+ (this.checked ? "체크된" : "체크 안 된") + " 체크박스 그리기");
	}
}
