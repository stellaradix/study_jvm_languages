package org.study.creational_abstract_factory.component.windows;

import org.study.creational_abstract_factory.component.Button;

public class WindowsButton extends Button {

	public WindowsButton(String caption) {
		super(caption);
	}

	@Override
	public void render() {
		System.out.println("Windows Rendering API 이용: "
				+ this.caption + " 버튼 그리기");
	}
}
