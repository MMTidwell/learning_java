package com.java24hours;

public class Benchmark {
	public static void main (String[] args) {
		long startTime = System.currentTimeMillis();
		long endTime = startTime + 60000;
		long index = 0;
		
		while (true) {
			long now = System.currentTimeMillis();
			
			if (now > endTime) {
				break;
			}
			index++;
		}
		System.out.println(index + " loops in one minute.");
	}
}