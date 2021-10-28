package com.savi.inheritence.inherit;

public class NaturalsSaloon extends Saloon {
	public String name="shrey";
	public int noOfHajama=18;
	
	public NaturalsSaloon() {
		// TODO Auto-generated constructor stub


		
		System.out.println("invoked no-arg const------(hiiii this is from  NaturalsSaloon child class)");
	}
	
	public NaturalsSaloon(String name){
		this.name=name;
		this.noOfHajama=noOfHajama;
		System.out.println("invoked parameterised------(hiiii this is from NaturalsSaloon child class)");
	}
		
		
	}


