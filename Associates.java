package com.xworkz.crudoperation.crud;

public class Associates {
	BridDataDAO dao;
	
	
	private int id;
	private String breed;
	private int age;
	private String origin;
	private boolean canfly;

	public Associates(int id, String breed, int age, String origin, boolean canfly) {
		super();
		this.id = id;
		this.breed = breed;
		this.age = age;
		this.origin = origin;
		this.canfly = canfly;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public boolean isCanfly() {
		return canfly;
	}

	public void setCanfly(boolean canfly) {
		this.canfly = canfly;
	}


}





