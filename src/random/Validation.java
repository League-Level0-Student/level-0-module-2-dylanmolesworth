//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		// 1. OPTIONAL: Watch the first 2 minutes of this movie: http://vimeo.com/2485018
		
		int randomNumber = new Random().nextInt(5);
		
		// 2. On paper, write all the numbers that get printed when you run this class 10 times
		
		System.out.println(randomNumber);

		// 3. Use each value of randomNumber to give the user a random compliment.
		
		for (int i = 0; i < 11; i++) {
			
		
		
		if (randomNumber == 0) {
			System.out.println("Cool Shirt");
		}
		if (randomNumber == 1) {
			System.out.println("Well Done");
		}
		if (randomNumber == 2) {
			System.out.println("Good Code");
		}
		if (randomNumber == 3) {
			System.out.println("Hope You Like It");
		}
		if (randomNumber == 4) {
			System.out.println("Nice");
		}
	}

		// 4. Repeat all the code above 10 times
		
		// 5. Find someone to test out your program. They will like it :)
	}
}
