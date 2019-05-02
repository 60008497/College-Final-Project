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
		
		String[][] goodOutcome = new String[5][5];
		String[][] badOutcome = new String[5][5];
		
		
		////  #  _____  #  -----  #          OUTCOMES          #  -----  #  _____  #  ////
		
		// Bad health drain 1
		// Bad health drain 2
		// Good 50/50 health
		// Good health gain 1
		// Good health gain 2
		// Bad stamina drain 1
		// Bad stamina drain 2
		// Good 50/50 stamina
		// Good stamina gain 1
		// Good stamina gain 2
		// Bad money drain 1
		// Bad money drain 2
		// Good 50/50 money
		// Good money gain 1
		// Good money gain 2
		// Good Stamina for Health
		// Good Stamina for Money
		// Good Health for Money
		// Good Health for Stamina
		// Good Money for Health
		// Good Money for Stamina
		
		//End Score properties:
		int choices = 0;
		int badChoices = 0;
		int goodChoices = 0;
		int purchases = 0;
		int enemiesBattled = 0;
		
		//Random
		Random rand = new Random();
		int good_or_bad = 0;
		
		//ShopStuff: 1= Health 2= Stamina 3= Extra Door 4= Percent Reader 5= Always Good 6= Blindness
		int[] shopStuff = new int[3];
		
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
				System.out.print("| Money:" + String.format("%6s", money) + "$  Stamina: " + String.format("%3s", stamina) + "   Health: " + String.format("%3s", health) + " |\n");
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
			playerInput--;
			
						
			//End Loop (For Debugging)
			health = 0;
		}
	}
}
