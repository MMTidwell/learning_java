package com.activities;

public class Hour9 {
	public static void main (String[] args) {
		// Declares multidim array called student 
		int[][] student = new int[6][6];
		// declares the grades for each student based on their names
		int[] janice = {90,85,85,75,70,95};
		int[] mikey = {95,85,85,70,75,90};
		int[] nicki = {85,80,85,95,100,100};
		int[] bernice = {80,90,90,80,85,95};
		int[] ernest = {75,45,80,95,90,90};
		int[] bigMike = {90,90,90,95,70,65};
		
		// declares the students to the index of the student array
		student[0] = janice;
		student[1] = mikey;
		student[2] = nicki;
		student[3] = bernice;
		student[4] = ernest;
		student[5] = bigMike;
		
		// placeholder for each student grades summed
		int gradeSum = 0;
		// placeholder for each student grades
		int[] studentSum = new int[6];
		
		// holds the index number for each student
		for (int i = 0; i < 6; i++) {
			// prints the first line "Student: 1"
			System.out.println("Student: " + i);
			studentSum[i] = 0;
			// holds the sum of each student
			for (int j = 0; j < 6; j++) {
				// total sum for all student grades
				gradeSum += student[i][j];
				// total sum for each students grades
				studentSum[i] += student[i][j];
			}
			// displays each students average
			System.out.println(" Average grade: " + studentSum[i]/6);
		}
		// displays the average of all students
		System.out.println("\nAverage grade of all students: " + gradeSum/36);
		System.out.println();
		mutliples();
	} 
	
	
	public static void mutliples() {
		// initiates an array that can hold 400 elements
		int[] thirteens =  new int[400];
		// number of elements placed in the array
		int numFound = 0;
		// number that might be a multiple of 13
		int candidate = 1;

		// checks to make sure that the array is not 400+ elements or longer
		while (numFound < 400) {
			// checks if candidate number is % to 13
			if (candidate % 13 == 0) {
				// places the candidate number in the index based on the number of index found
				thirteens[numFound] = candidate;
				numFound++;
			}
			candidate++;
		}
		System.out.println("First 400 multiples of 13:");
		// prints out the thirteens array
		for (int i = 0; i < 400; i++) {
			System.out.print(thirteens[i] + " ");
		}
	}
}











