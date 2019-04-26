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
		int playerInput = 0;
		int[] riskInt = new int[3];
		String[] risk = new String[3];
		
		//Random
		Random rand = new Random();
		
		//Player Stats
		int health = 100;
		int stamina = 10;
		int money = 10;
		
		//The loop of the program!
		while (health > 0 && stamina > 0) {
			
			// Get 3 random risk factors
			for (int i = 0; i <= 2; i++) {
				riskInt[i] = rand.nextInt(100) + 1;
				if (riskInt[i] >= 0 && riskInt[i] <= 33) {
					risk[i] = "Low ";
				}
				if (riskInt[i] >= 34 && riskInt[i] <= 66) {
					risk[i] = "Med ";
				}
				if (riskInt[i] >= 67 && riskInt[i] <= 100) {
					risk[i] = "High";
				}
			}
			
			//Clear, then basic displays.
			for (int n = 0; n <= 100; n++) {
				System.out.printf("\n");
			}
			System.out.print("\n ___________________________________________ ");
			System.out.print("\n| Money: " + String.format("%1$5s", money) + " Stamina: " + String.format("%1$5s", stamina) + " Health: " + String.format("%1$5s", health) + " |");
			System.out.print("\n|                                           |");
			
			health = 0;
			// stamina = 0;
		}
	}
}
