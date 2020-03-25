package fr.CCI.LPDAOO.java.paint_Back.model.shapes.minimized;

import java.beans.Transient;

public class Pouik {
	
	private String name;
	private int age;
	
	public Pouik() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Transient
	public String getTruc() {
		return "machin";
	}

	
	
	@Override
	public String toString() {
		return "Pouik [name=" + name + ", age=" + age + "]";
	}
	
	
	
	

}
