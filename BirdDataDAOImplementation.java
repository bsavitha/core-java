package com.xworkz.crudoperation.crud;

import com.xworkz.crudoperation.*;

public class BirdDataDAOImplementation implements BridDataDAO {
	private String[] birdBreeds = new String[5];
	int count = 0;
	private int age;
	private Object ref;
	private int age1;
	private Object getBreed;

	public void addBridData(String breed) {
		// TODO Auto-generated method stub
		if (count < 5) {
			this.birdBreeds[this.count] = breed;
			this.count++;
		} else {
			System.err.println("CANT ADD LIMIT EXCEEDED");
		}

	}

	public int deleteBirdData(int index) {
		// TODO Auto-generated method stub
		if (index >= 0 && index < this.birdBreeds.length) {
			System.out.println("index pointing null is :".concat(String.valueOf(index)));
			this.birdBreeds[index] = null;
		}
		return index;

	}

	public void searchBridData() {
		// TODO Auto-generated method stub

	}

	public void DisplayBirdData() {
		// TODO Auto-generated method stub
		for (int i = 0; i < birdBreeds.length; i++) {
			System.out.println(birdBreeds[i]);
		}

	}

	public void addBridData() {
		// TODO Auto-generated method stub

	}

	public void DisplayBrrdData() {
		// TODO Auto-generated method stub

	}

	public void deleteBirdData() {
		// TODO Auto-generated method stub

	}

	public void updateBridData(String breed) {
		// TODO Auto-generated method stub
		if (birdBreeds != null) {

			for (int i = 0; i < birdBreeds.length; i++) {
				String ref = birdBreeds[i];

				if (ref != null) {
					String breed1 = ref.getBreed;

					if (breed == breed1) {
						System.out.println("bird breed is found");
					} else {
						System.err.println("bird breed is not found");
					}
				}
			}
		}
	}

	public void updateBridData() {
		// TODO Auto-generated method stub

	}

}
