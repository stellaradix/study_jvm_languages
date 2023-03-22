package org.study.creational_abstract_factory.component;

public abstract class Button {

	protected String caption;

	public Button(String caption) {
		this.caption = caption;
	}

	public void clickEvent() {
		System.out.println(caption + " 버튼을 클릭했습니다");
	}

	public abstract void render();
}
