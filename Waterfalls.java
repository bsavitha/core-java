package com.xworkz.crud.subcrud;

public class Waterfalls {
	
private String[] names = new String[5];
int count=0;



public Waterfalls() {
	// TODO Auto-generated constructor stub
	System.out.println("WATERFALLS");
}
public void Addnames(String names) {
	if(count<5) {
		this.names[this.count]= names;
		this.count++;
	} else {
		System.err.println("CANT ADD LIMIT EXCEEDED");
	}
}

public void Displaynames() {
	for (int i = 0; i < names.length; i++) {
		System.out.println(names[i]);

	}
}

}

