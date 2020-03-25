package fr.CCI.LPDAOO.java.paint_Back.model.shapes.petitmodel;

import java.beans.Transient;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Human {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	private String name;
	private int age;
	
	
	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}



	
	
	public Human() {
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
