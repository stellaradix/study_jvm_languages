package org.study.creational_abstract_factory.component;

public abstract class TextEdit {

	protected String value;

	public TextEdit(String value) {
		this.value = value;
	}

	public void setValue(String value) {
		this.value = value;
		render();
	}

	public abstract void render();
}
