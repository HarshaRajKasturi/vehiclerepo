package com.cg.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vechile {
	@Id
	private int vId;
	private String brand;
	private String color;
	
	public Vechile() {}
	
	
	public Vechile(int vId, String brand, String color) {
		super();
		this.vId = vId;
		this.brand = brand;
		this.color = color;
	}


	public int getvId() {
		return vId;
	}


	public void setvId(int vId) {
		this.vId = vId;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return "Vechile [vId=" + vId + ", brand=" + brand + ", color=" + color + "]";
	}
	
	

}
