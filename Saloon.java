package com.savi.inheritence.inherit;

public class Saloon {
	public String name;//="savi";
	public int noOfHajama;//=7;

	public Saloon() {
		// TODO Auto-generated constructor stub
		this("savi",7);
		
		System.out.println("invoked no-arg const------(hiiii this is from SALOON parent class)");

	}

	public Saloon(String name, int noOfHajama) {
		this.name=name;
		this.noOfHajama=noOfHajama;
	
		System.out.println("invoked parameterised const------(hiiii this is from SALOON parent class)");
		

	}

}
