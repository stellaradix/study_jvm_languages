package org.study.creational_abstract_factory.component.linux;

import org.study.creational_abstract_factory.component.Button;

public class LinuxButton extends Button {

	public LinuxButton(String caption) {
		super(caption);
	}

	@Override
	public void render() {
		System.out.println("Linux Rendering API 이용: "
				+ this.caption + " 버튼 그리기");
	}
}
