package com.savi.inheritence.inherit;

public class GoldFish extends Fish {
	public String color;
	public int size;
	public String region;
	public boolean alive;

	public GoldFish() {
		// TODO Auto-generated constructor stub
		this("ssss",true);
		System.out.println("no-arg const---from GOLDFISH --parent class");
	}
	public GoldFish(String region,boolean alive) {
		this.region=region;
		this.alive=alive;
		System.out.println("no-arg const---from GOLDFISH --parent class");
	}
	
}
