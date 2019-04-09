/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class Final_Java_Project {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int score = 0;
			int low = 0;
			int med = 0;
			int hi = 0;
			double choice = 0.0;
			
				String Low1 = "Stay up past bed time";
				String Med1 = "Sneak out to go party";
				String Hi1 ="Steal some of your parents alcohol";
			  
			System.out.println("                                               You are left home alone what do you choose to do? ");
			System.out.println("______________________________________________________________________________________________________________________________________________");
			System.out.println("|                  Low Risk                    |                   Medium Risk                 |                 High Risk                   |");
			System.out.println("|----------------------------------------------|-----------------------------------------------|---------------------------------------------|");
			System.out.println("|                                              |                                               |                                             |");
			System.out.println("|            "+ Low1 +"             |             "+Med1 +"             |      "+ Hi1 +"     |");
			System.out.println("|                                              |                                               |                                             |");
			System.out.println("|______________________________________________|_______________________________________________|_____________________________________________|");
			
			System.out.println("");
			System.out.println("Type 1 for Low Risk, Type 2 for Medium Risk and Type 3 for High Risk:");
			
			choice = input.nextDouble();
			
			if (choice == 1) {
				score += 100;
				low += 1;
			}
			else if (choice == 2) {
				score += 200;
				med += 1;
			}
			else if (choice == 3) {
				score += 300;
				hi += 1;
			}
			else {
				System.out.println("Not a Valid Option");
			}
			 
			System.out.println("Your current score is " + score);
			System.out.println("You have chose " + low + " risks");
			System.out.println("You have chose " + med + " risks");
			System.out.println("You have chose " + hi + " risks");
			
//________________________________________________________________________________________________________________________________________________________________________________
			
				String Low2 = "Show your parents your report card";
				String Med2 = "Hide your report card";
				String Hi2 ="Bribe your teacher";
			  
			System.out.println("                                               You recieved an F on a test? ");
			System.out.println("______________________________________________________________________________________________________________________________________________");
			System.out.println("|                  Low Risk                    |                   Medium Risk                 |                 High Risk                   |");
			System.out.println("|----------------------------------------------|-----------------------------------------------|---------------------------------------------|");
			System.out.println("|                                              |                                               |                                             |");
			System.out.println("| "+ Low2 +"           |             "+Med2 +"             |        "+ Hi2 +"                   |");
			System.out.println("|                                              |                                               |                                             |");
			System.out.println("|______________________________________________|_______________________________________________|_____________________________________________|");
			
			System.out.println("");
			System.out.println("Type 1 for Low Risk, Type 2 for Medium Risk and Type 3 for High Risk:");
			
			choice = input.nextDouble();
			
			if (choice == 1) {
				score += 100;
				low += 1;
			}
			else if (choice == 2) {
				score += 200;
				med += 1;
			}
			
			else if (choice == 3) {
				score += 300;
				hi += 1;
			}
			else {
				System.out.println("Not a Valid Option");
			}
			
			if (hi >= 5 ){
				System.out.println("You have failed the game, try again"); 
			}
			else if (med >= 7){
				System.out.println("You have failed the game, try again");
			}
			
			else if (score >= 1500){
				System.out.println("You have risked your way through the game, congradulations");
			}
			else {
				System.out.println(" ");
			}
			System.out.println("Your current score is " + score);
			System.out.println("You have chose " + low + " risks");
			System.out.println("You have chose " + med + " risks");
			System.out.println("You have chose " + hi + " risks");
			
//________________________________________________________________________________________________________________________________________________________________________________
			
				String Low3 = "Throw it away and tell the teacher";
				String Med3 = "Use it to get a good score on the test";
				String Hi3 ="You duplicate it for everyone";
			  
			System.out.println("                                               You are given the cheat sheet for a test, what do you do? ");
			System.out.println("______________________________________________________________________________________________________________________________________________");
			System.out.println("|                  Low Risk                    |                   Medium Risk                 |                 High Risk                   |");
			System.out.println("|----------------------------------------------|-----------------------------------------------|---------------------------------------------|");
			System.out.println("|                                              |                                               |                                             |");
			System.out.println("| "+ Low3 +"           |    "+Med3 +"     |         "+ Hi3 +"       |");
			System.out.println("|                                              |                                               |                                             |");
			System.out.println("|______________________________________________|_______________________________________________|_____________________________________________|");
			
			System.out.println("");
			System.out.println("Type 1 for Low Risk, Type 2 for Medium Risk and Type 3 for High Risk:");
			
			choice = input.nextDouble();
			
			if (choice == 1) {
				score += 100;
				low += 1;
			}
			else if (choice == 2) {
				score += 200;
				med += 1;
			}
			else if (choice == 3) {
				score += 300;
				hi += 1;
			}
			else {
				System.out.println("Not a Valid Option");
			}
			
			if (hi >= 5 ){
				System.out.println("You have failed the game, try again"); 
			}
			else if (med >= 7){
				System.out.println("You have failed the game, try again");
			}
			else if (score >= 1500){
				System.out.println("You have risked your way through the game, congradulations");
			}
			else {
				System.out.println(" ");
			}
			System.out.println("Your current score is " + score);
			System.out.println("You have chose " + low + " risks");
			System.out.println("You have chose " + med + " risks");
			System.out.println("You have chose " + hi + " risks");
//__________________________________________________________________________________________________________________________________________

				String Low4 = "Throw it away and tell the teacher";
				String Med4 = "Use it to get a good score on the test";
				String Hi4 ="You duplicate it for everyone";
			  
			System.out.println("                                               You are given the cheat sheet for a test, what do you do? ");
			System.out.println("______________________________________________________________________________________________________________________________________________");
			System.out.println("|                  Low Risk                    |                   Medium Risk                 |                 High Risk                   |");
			System.out.println("|----------------------------------------------|-----------------------------------------------|---------------------------------------------|");
			System.out.println("|                                              |                                               |                                             |");
			System.out.println("| "+ Low4 +"           |    "+Med4 +"     |         "+ Hi4 +"       |");
			System.out.println("|                                              |                                               |                                             |");
			System.out.println("|______________________________________________|_______________________________________________|_____________________________________________|");
			
			System.out.println("");
			System.out.println("Type 1 for Low Risk, Type 2 for Medium Risk and Type 3 for High Risk:");
			
			choice = input.nextDouble();
			
			if (choice == 1) {
				score += 100;
				low += 1;
			}
			else if (choice == 2) {
				score += 200;
				med += 1;
			}
			else if (choice == 3) {
				score += 300;
				hi += 1;
			}
			else {
				System.out.println("Not a Valid Option");
			}
			
			if (hi >= 5 ){
				System.out.println("You have failed the game, try again"); 
			}
			else if (med >= 7){
				System.out.println("You have failed the game, try again");
			}
			else if (score >= 1500){
				System.out.println("You have risked your way through the game, congradulations");
			}
			else {
				System.out.println(" ");
			}
			
			System.out.println("Your current score is " + score);
			System.out.println("You have chose " + low + " risks");
			System.out.println("You have chose " + med + " risks");
			System.out.println("You have chose " + hi + " risks");
	}
}