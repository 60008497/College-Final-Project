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
		
		// Special Items
		int percent_reader = 0;
		int always_good = 0;
		int blind_eye = 0;
		
		//_______________The loop of the program!_______________
		while (health > 0 && stamina > 0) {
			
			//_______________Get 3 random risk factors_______________
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
			
			//_______________Loop this while playerInput is over 3 or under 1_______________
			while (playerInput >= 4 || playerInput <= 0) {
				//________________Clear, then basic displays._______________
				for (int n = 0; n <= 100; n++) {
					System.out.printf("\n");
				}
				System.out.print(" ___________________________________________ \n");
				System.out.print("| Money:" + String.format("%1$6s", money) + "$  Stamina: " + String.format("%1$3s", stamina) + "   Health: " + String.format("%1$3s", health) + " |\n");
				System.out.print("|                                           |\n");
				
				//_______________Print Doors, Items Can Change Display, Ask for Player Input._______________
				if (blind_eye == 0) {
					System.out.print("|                                           |\n");
				}
				if (blind_eye >= 1) {
					System.out.print("|   !-You Are Blinded-!                     |\n");
				}
				
				for (int i = 0; i <= 2; i++) {
					if (blind_eye >= 1) {
						System.out.print("| Door " + (i+1) + "= Unknown                           |\n");
					}
					else if (percent_reader >= 1) {
						System.out.print("| Door " + (i+1) + "= " + String.format("%1$3s", riskInt[i]) + "% chance for bad outcome.      |\n");
					}
					else {
						System.out.print("| Door " + (i+1) + "= " + String.format("%1$4s", risk[i]) + "                              |\n");
					}
				}
				System.out.print("|                                           |\n");
				System.out.print("| Use 1, 2, or 3 to choose a door.          |\n");
				System.out.print(" ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯ \n");
				//Player Input
				playerInput = input.nextInt();
			}
			
			
			
			//End Loop (For Debugging)
			health = 0;
		}
	}
}
