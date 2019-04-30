import java.util.Scanner;
import java.util.Random;

class Final_Java_Project {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int score = 0;
			int low = 0;
			int med = 0;
			int hi = 0;
			int choice = 0;
//___________________________________________________________________________________________________________________________________________________________________________________________
			
			//_______________________________________________________________________________________________________________
				String Problem1 = "You are left home alone what do you do?"; 				
				String Low1 = "Stay up past bed time";
				String Med1 = "Sneak out to go party";
				String Hi1 ="Steal some of your parents alcohol";
			//_______________________________________________________________________________________________________________
				String Problem2 = "You recieved an F on a test, what do you do?";
				String Low2 = "Show your parents your report card";
				String Med2 = "Hide your report card";
				String Hi2 ="Bribe your teacher";
			//_______________________________________________________________________________________________________________
				String Problem3 = "You are given the cheat sheet for a test, what do you do?";
				String Low3 = "Throw it away and tell the teacher";
				String Med3 = "Use it to get a good score on the test";
				String Hi3 ="You duplicate it for everyone";
			//_______________________________________________________________________________________________________________
				String Problem4 = " You are given the cheat sheet for a test, what do you do? ";
				String Low4 = "Throw it away and tell the teacher";
				String Med4 = "Use it to get a good score on the test";
				String Hi4 ="You duplicate it for everyone";
			//_______________________________________________________________________________________________________________
				String Problem5 = "You see a man drop his wallet on the street, what do you do? ";
				String Low5 = "Pick it up and run it to him";
				String Med5 = "Open it and steal a $20 bill";
				String Hi5 ="Steal the whole wallet";
			//_______________________________________________________________________________________________________________
				String Problem6 = "You are recieve a package in the mail that was delievered to the wrong address, what do you do?";
				String Low6 = "Return it to the post office";
				String Med6 = "Keep it without telling anyone";
				String Hi6 ="Open it and keep whatever is inside";
			//_______________________________________________________________________________________________________________
				String Problem7 = "You see a coworker steal some money from the register, what do you do? ";
				String Low7 = "Tell your manager immediately";
				String Med7 = "Don't say anything";
				String Hi7 ="Steal some money too";
			//_______________________________________________________________________________________________________________
				String Problem9 = "You are offered to try drugs, what do you do?";
				String Low9 = "Say no and tell the police";
				String Med9 = "Just say no";
				String High9 = "Go for it, you only live once";
			//_______________________________________________________________________________________________________________							
				String Problem10 = "You are walking down the street and see a person getting mugged, what do you do?";
				String Low10 = "Run to help them while calling 911";
				String Med10 = "Call 911 and walk away";
				String High10 = "Ignore it and get on with your day";
			//_______________________________________________________________________________________________________________	
				String Problem11 = "You see a homeless person on the side of the street, what do you do?";
				String Low11 = "Buy them some food and some warm clothes";
				String Med11 = "Dig some change out of your pocket";
				String High11 = "Walk away and kick dust at them";
			//_______________________________________________________________________________________________________________							
				String Problem12 = "While walking home you see a stray dog with a collar tag, what do you do?";
				String Low12 = "Look at the collar and call the number";
				String Med12 = "Take the dog to the dog shelter";
				String High12 = "Steal the dog and take it home";
			//_______________________________________________________________________________________________________________								
				String Problem13 = "You are at the store and see someone knock over the whole shelf, what do you do?";
				String Low13 = "Go pick it up quietly";
				String Med13 = "Tell and employee";
				String High13 = "Yell at the person who knocked it over";
			//_______________________________________________________________________________________________________________								
				String Problem14 = "The neighbors garbage can fell over and trash spilled everywhere, what do you do?";
				String Low14 = "Pick it up and take it to the landfill";
				String Med14 = "Put it all back in the trashcan";
				String High14 = "Take it and spread the trash everywhere";
			//_______________________________________________________________________________________________________________								
				String Problem15 = "The bank teller gives you 5 $100 bills instead of 5 $10 bills, what do you do?";
				String Low15 = "Correct their mistake and take the loss";
				String Med15 = "Take the money";
				String High15 = "Take the money and get the teller fired";
			//_______________________________________________________________________________________________________________								
				String Problem16 = "The car in front of you catches on fire and pulls off the road, what do you do?";
				String Low16 = "Stop your car and try to put the fire out";
				String Med16 = "Get all the people out, but leave the car";
				String High16 = "Drive past them without stopping";
			//_______________________________________________________________________________________________________________								
				String Problem17 = "You see a hitchhiker walking down the side of the freeway, what do you do?";
				String Low17 = "Pick them up and drop take them somewhere";
				String Med17 = "Leave them on the side of the road";
				String High17 = "Drive past them and spit on them";
			//_______________________________________________________________________________________________________________								
				String Problem18 = "You are offered a shot of vodka, what do you do?";
				String Low18 = "Say no and go home";
				String Med18 = "Try a little bit of it";
				String High18 = "How about 5 more shots";
			//_______________________________________________________________________________________________________________								
				String Problem19 = "You work at a vallet service and a nice car pulls up, what do you do?";
				String Low19 = "Drive it to a parking spot and let it be";
				String Med19 = "Take it on a joyride around the block";
				String High19 = "Go pick up your friends and have a party";
			//_______________________________________________________________________________________________________________								
				String Problem20 = "You see a wounded cat on the road, what do you do?";
				String Low20 = "Pick it up and take it to the hospital";
				String Med20 = "Move it to the side of the road";
				String High20 = "Leave it in the middle of the road";
			//_______________________________________________________________________________________________________________								
										
											
											
											
											
			System.out.println("                                               " + Problem1 +" ");
			System.out.println("______________________________________________________________________________________________________________________________________________");
			System.out.println("|                  Low Risk                    |                   Medium Risk                 |                 High Risk                   |");
			System.out.println("|----------------------------------------------|-----------------------------------------------|---------------------------------------------|");
			System.out.println("|                                              |                                               |                                             |");
			System.out.println("|            "+ Low1 +"             |             "+Med1 +"             |      "+ Hi1 +"     |");
			System.out.println("|                                              |                                               |                                             |");
			System.out.println("|______________________________________________|_______________________________________________|_____________________________________________|");
			
			System.out.println("");
			System.out.println("Type 1 for Low Risk, Type 2 for Medium Risk and Type 3 for High Risk:");
			
			choice = input.nextInt();
			
			System.out.println("You chose: " + choice);
			
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
			System.out.println("You have chose " + low + " Low risks");
			System.out.println("You have chose " + med + " Medium risks");
			System.out.println("You have chose " + hi + " High risks");
			System.out.println("_______________________________________________________________________________________________________________________________________________");			
//________________________________________________________________________________________________________________________________________________________________________________
			//Question number 2
			
				
			  
			System.out.println("                                              " + Problem2 + "  ");
			System.out.println("______________________________________________________________________________________________________________________________________________");
			System.out.println("|                  Low Risk                    |                   Medium Risk                 |                 High Risk                   |");
			System.out.println("|----------------------------------------------|-----------------------------------------------|---------------------------------------------|");
			System.out.println("|                                              |                                               |                                             |");
			System.out.println("| "+ Low2 +"           |             "+Med2 +"             |        "+ Hi2 +"                   |");
			System.out.println("|                                              |                                               |                                             |");
			System.out.println("|______________________________________________|_______________________________________________|_____________________________________________|");
			
			System.out.println("");
			System.out.println("Type 1 for Low Risk, Type 2 for Medium Risk and Type 3 for High Risk:");
			
			choice = input.nextInt();
			
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
				System.exit(0);
			}
			else if (med >= 7){
				System.out.println("You have failed the game, try again");
				System.exit(0);			
			}
			
			else if (score >= 1500){
				System.out.println("You have risked your way through the game, congradulations");
				System.exit(0);				
			}
			else {
				System.out.println(" ");
			}
			System.out.println("Your current score is " + score);
			System.out.println("You have chose " + low + " Low risks");
			System.out.println("You have chose " + med + " Medium risks");
			System.out.println("You have chose " + hi + " High risks");

			System.out.println("_______________________________________________________________________________________________________________________________________________");			
//________________________________________________________________________________________________________________________________________________________________________________
			//Question number 3
			
				
			  
			System.out.println("                                              " + Problem3 + "  ");
			System.out.println("______________________________________________________________________________________________________________________________________________");
			System.out.println("|                  Low Risk                    |                   Medium Risk                 |                 High Risk                   |");
			System.out.println("|----------------------------------------------|-----------------------------------------------|---------------------------------------------|");
			System.out.println("|                                              |                                               |                                             |");
			System.out.println("| "+ Low3 +"           |    "+Med3 +"     |         "+ Hi3 +"       |");
			System.out.println("|                                              |                                               |                                             |");
			System.out.println("|______________________________________________|_______________________________________________|_____________________________________________|");
			
			System.out.println("");
			System.out.println("Type 1 for Low Risk, Type 2 for Medium Risk and Type 3 for High Risk:");
			
			choice = input.nextInt();
			
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
				System.exit(0);
			}
			else if (med >= 7){
				System.out.println("You have failed the game, try again");
				System.exit(0);			
			}
			
			else if (score >= 1500){
				System.out.println("You have risked your way through the game, congradulations");
				System.exit(0);				
			}
			else {
				System.out.println(" ");
			}
			System.out.println("Your current score is " + score);
			System.out.println("You have chose " + low + " Low risks");
			System.out.println("You have chose " + med + " Medium risks");
			System.out.println("You have chose " + hi + " High risks");

			System.out.println("_______________________________________________________________________________________________________________________________________________");
//________________________________________________________________________________________________________________________________________________________________________________________
			//Question number 4

				
			  
			System.out.println("                                              " + Problem4 + " ");
			System.out.println("______________________________________________________________________________________________________________________________________________");
			System.out.println("|                  Low Risk                    |                   Medium Risk                 |                 High Risk                   |");
			System.out.println("|----------------------------------------------|-----------------------------------------------|---------------------------------------------|");
			System.out.println("|                                              |                                               |                                             |");
			System.out.println("| "+ Low4 +"           |    "+Med4 +"     |         "+ Hi4 +"       |");
			System.out.println("|                                              |                                               |                                             |");
			System.out.println("|______________________________________________|_______________________________________________|_____________________________________________|");
			
			System.out.println("");
			System.out.println("Type 1 for Low Risk, Type 2 for Medium Risk and Type 3 for High Risk:");
			
			choice = input.nextInt();
			
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
				System.exit(0);
			}
			else if (med >= 7){
				System.out.println("You have failed the game, try again");
				System.exit(0);			
			}
			
			else if (score >= 1500){
				System.out.println("You have risked your way through the game, congradulations");
				System.exit(0);				
			}
			else {
				System.out.println(" ");
			}
			System.out.println("Your current score is " + score);
			System.out.println("You have chose " + low + " Low risks");
			System.out.println("You have chose " + med + " Medium risks");
			System.out.println("You have chose " + hi + " High risks");
			System.out.println("_______________________________________________________________________________________________________________________________________________");
//__________________________________________________________________________________________________________________________________________________________________________________
		//Question number 5
			
			
		  
		System.out.println("                                          " + Problem5 + " ");
		System.out.println("______________________________________________________________________________________________________________________________________________");
		System.out.println("|                  Low Risk                    |                   Medium Risk                 |                 High Risk                   |");
		System.out.println("|----------------------------------------------|-----------------------------------------------|---------------------------------------------|");
		System.out.println("|                                              |                                               |                                             |");
		System.out.println("|    "+ Low5 +"              |             "+ Med5 +"      |        "+ Hi5 +"               |");
		System.out.println("|                                              |                                               |                                             |");
		System.out.println("|______________________________________________|_______________________________________________|_____________________________________________|");
		
		System.out.println("");
		System.out.println("Type 1 for Low Risk, Type 2 for Medium Risk and Type 3 for High Risk:");
		
		choice = input.nextInt();
		
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
			System.exit(0);
		}
		else if (med >= 7){
			System.out.println("You have failed the game, try again");
			System.exit(0);			
		}
		
		else if (score >= 1500){
			System.out.println("You have risked your way through the game, congradulations");
			System.exit(0);				
		}
		else {
			System.out.println(" ");
		}
		System.out.println("Your current score is " + score);
		System.out.println("You have chose " + low + " Low risks");
		System.out.println("You have chose " + med + " Medium risks");
		System.out.println("You have chose " + hi + " High risks");
		System.out.println("_______________________________________________________________________________________________________________________________________________");
//_________________________________________________________________________________________________________________________________________________________________________________
			//Question number 6

				
			  
			System.out.println("                       " + Problem6 + " ");
			System.out.println("______________________________________________________________________________________________________________________________________________");
			System.out.println("|                  Low Risk                    |                   Medium Risk                 |                 High Risk                   |");
			System.out.println("|----------------------------------------------|-----------------------------------------------|---------------------------------------------|");
			System.out.println("|                                              |                                               |                                             |");
			System.out.println("|    "+ Low6 +"              |          "+Med6 +"       |      "+ Hi6 +"    |");
			System.out.println("|                                              |                                               |                                             |");
			System.out.println("|______________________________________________|_______________________________________________|_____________________________________________|");
			
			System.out.println("");
			System.out.println("Type 1 for Low Risk, Type 2 for Medium Risk and Type 3 for High Risk:");
			
			choice = input.nextInt();
			
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
				System.exit(0);
			}
			else if (med >= 7){
				System.out.println("You have failed the game, try again");
				System.exit(0);			
			}
			
			else if (score >= 1500){
				System.out.println("You have risked your way through the game, congradulations");
				System.exit(0);				
			}
			else {
				System.out.println(" ");
			}
			System.out.println("Your current score is " + score);
			System.out.println("You have chose " + low + " Low risks");
			System.out.println("You have chose " + med + " Medium risks");
			System.out.println("You have chose " + hi + " High risks");System.out.println("_______________________________________________________________________________________________________________________________________________");	
//_____________________________________________________________________________________________________________________________________________________________________________
		//Question number 7

			
		  
		System.out.println("                                 " + Problem7 + " ");
		System.out.println("______________________________________________________________________________________________________________________________________________");
		System.out.println("|                  Low Risk                    |                   Medium Risk                 |                 High Risk                   |");
		System.out.println("|----------------------------------------------|-----------------------------------------------|---------------------------------------------|");
		System.out.println("|                                              |                                               |                                             |");
		System.out.println("|      "+ Low7 +"           |              "+Med7 +"               |           "+ Hi7 +"            1  |");
		System.out.println("|                                              |                                               |                                             |");
		System.out.println("|______________________________________________|_______________________________________________|_____________________________________________|");
		
		System.out.println("");
		System.out.println("Type 1 for Low Risk, Type 2 for Medium Risk and Type 3 for High Risk:");
		
		choice = input.nextInt();
		
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
			System.exit(0);
		}
		else if (med >= 7){
			System.out.println("You have failed the game, try again");
			System.exit(0);			
		}
		
		else if (score >= 1500){
			System.out.println("You have risked your way through the game, congradulations");
			System.exit(0);				
		}
		else {
			System.out.println(" ");
		}
		System.out.println("Your current score is " + score);
		System.out.println("You have chose " + low + " Low risks");
		System.out.println("You have chose " + med + " Medium risks");
		System.out.println("You have chose " + hi + " High risks");System.out.println("_______________________________________________________________________________________________________________________________________________");





	}
}
