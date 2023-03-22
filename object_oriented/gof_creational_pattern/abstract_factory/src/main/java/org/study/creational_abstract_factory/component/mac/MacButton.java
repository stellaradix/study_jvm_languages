package org.study.creational_abstract_factory.component.mac;

import org.study.creational_abstract_factory.component.Button;

public class MacButton extends Button {

	public MacButton(String caption) {
		super(caption);
	}

	@Override
	public void render() {
		System.out.println("Mac Rendering API 이용: "
				+ this.caption + " 버튼 그리기");
	}
}
