package com.savi.inheritence;

import com.savi.inheritence.inherit.NaturalsSaloon;
import com.savi.inheritence.inherit.Saloon;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NaturalsSaloon naturalsSaloon=new NaturalsSaloon();
		System.out.println(naturalsSaloon.name);
		System.out.println(naturalsSaloon.noOfHajama);
		
		Saloon saloon=new NaturalsSaloon();
		System.out.println(saloon.name);
		System.out.println(saloon.noOfHajama);
		

	}

}
