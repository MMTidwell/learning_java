package com.java24hours;

import java.util.*;

class Dice {
	public static void main (String[] arguments) {
		Random generator = new Random();
		// must create a int to hold the random number
		int value = generator.nextInt();
		System.out.println("This is your random number: " + value);
		// 6 is the highest number and 1 is the lowest number
		System.out.println((int) (Math.random() * 6) + 1);
	}
}
