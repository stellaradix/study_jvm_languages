package com.example.oop.creational.abstractfactory.component;

public abstract class CheckBox {

	protected boolean checked;

	public CheckBox(boolean checked) {
		this.checked = checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
		render();
	}

	public abstract void render();
}
