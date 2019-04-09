/*
Kolby Spring, Chloee Stephenson
College Final Project
B2
Project is a randomly generated text-based risk/reward game (A kind of roguelike).
*/
import java.util.Scanner;
import java.util.*;

class final_proj {
	// For executing the program, randomizing variables, and calling methods.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] riskInt = new int[3];
		String[] risk = new String[3];
		Random rand = new Random();
		
		
		
		// Get 3 random risk factors
		for (int i = 0; i <= 2; i++) {
			riskInt[i] = rand.nextInt(100) + 1;
			System.out.println(riskInt[i]); 
			if (riskInt[i] >= 0 && riskInt[i] <= 33) {
				risk[i] = "Low ";
			}
			if (riskInt[i] >= 34 && riskInt[i] <= 66) {
				risk[i] = "Med ";
			}
			if (riskInt[i] >= 67 && riskInt[i] <= 100) {
				risk[i] = "High";
			}
			System.out.println(risk[i]);
		}
	}
	
	// Displays the 3 door types, based off of input from main method, and asks player to choose a door, returns door properties.
	public static void doorMain(String[] args) {
		
	}
}
