package com.java24hours;

class PlanetWeight {
	public static void main (String[] args) {
		System.out.println("Your weight on Earth is ");
		double weight = 178;
		System.out.println(weight);
		
		double mercury = weight * .378;
		System.out.println("Your weight on Mercury is " + mercury);
		
		double moon = weight * .166;
		System.out.println("Your weight on the moon is " + moon);
		
		double jupiter = weight * 2.364;
		System.out.println("Your weight on Jupiter is " + jupiter);
	}
}