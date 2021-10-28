package com.savi.inheritence.inherit;

public class Fish {
	public String region;
	public boolean alive;
	public String color;
	public int size;
	public float height;
	public float weight;
	public Fish() {
		// TODO Auto-generated constructor stub
		this("jj",true);
		System.out.println("no-arg const---from FISH --parent class");
	}
	public Fish(String region,boolean alive) {
		this.region=region;
		this.alive=alive;
		System.out.println("para const---from FISH --parent class");
		
		
	}
	
	

}
