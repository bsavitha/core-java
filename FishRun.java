package com.savi.inheritence;
import com.savi.inheritence.inherit.Fish;
import com.savi.inheritence.inherit.GoldFish;
import com.savi.inheritence.inherit.SharkFish;
public class FishRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		GoldFish goldfish = new GoldFish();
		System.out.println(goldfish.region);
		System.out.println(goldfish.alive);
		
		SharkFish sharkFish=new SharkFish();
		System.out.println(sharkFish.height);
		System.out.println(sharkFish.weight);
		
		Fish fish = new GoldFish();
		System.out.println(fish.region);
		System.out.println(fish.alive);
		
		Fish fish1 = new SharkFish();
		System.out.println(fish1.height);
		System.out.println(fish1.weight);
		

	}

}
