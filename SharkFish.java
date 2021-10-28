package com.savi.inheritence.inherit;

public class SharkFish extends Fish{
public float height;
public float weight;

public SharkFish() {
	// TODO Auto-generated constructor stub
	this(70.7f,70.0f);
	System.out.println("no-arg const---from SHARKFISH --parent class");
}
public SharkFish(float height,float weight) {
	// TODO Auto-generated constructor stub
	System.out.println("para const---from SHARKFISH --parent class");
}



}
