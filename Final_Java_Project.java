import java.util.Scanner;

class Final_Java_Project {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int score = 0;
			int low = 0;
			int med = 0;
			int hi = 0;
			int choice = 0;
//___________________________________________________________________________________________________________________________________________________________________________________________
			//Question number 1
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
			
			String Low5 = "Pick it up and run it to him";
			String Med5 = "Open it and steal a $20 bill";
			String Hi5 ="Steal the whole wallet";
		  
		System.out.println("                                         You see a man drop his wallet on the street, what do you do?  ");
		System.out.println("______________________________________________________________________________________________________________________________________________");
		System.out.println("|                  Low Risk                    |                   Medium Risk                 |                 High Risk                   |");
		System.out.println("|----------------------------------------------|-----------------------------------------------|---------------------------------------------|");
		System.out.println("|                                              |                                               |                                             |");
		System.out.println("|    "+ Low5 +"              |             "+Med5 +"      |        "+ Hi5 +"               |");
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
		}
		else if (med >= 7){
			System.out.println("You have failed the game, try again");
		}
		
		else if (score >= 1500){
			System.out.println("You have risked your way through the game, congradulations");
		}
		else {
			System.out.println(" ");
			System.out.println("Your current score is " + score);
			System.out.println("You have chose " + low + " Low risks");
			System.out.println("You have chose " + med + " Medium risks");
			System.out.println("You have chose " + hi + " High risks");
	
			}
		System.out.println("_______________________________________________________________________________________________________________________________________________");
//_________________________________________________________________________________________________________________________________________________________________________________
			//Question number 6

				String Low6 = "Return it to the post office";
				String Med6 = "Keep it without telling anyone";
				String Hi6 ="Open it and keep whatever is inside";
			  
			System.out.println("                     You are recieve a package in the mail that was delievered to the wrong address, what do you do?  ");
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
			}
			else if (med >= 7){
				System.out.println("You have failed the game, try again");
			}
			
			else if (score >= 1500){
				System.out.println("You have risked your way through the game, congradulations");
			}
			else {
				System.out.println(" ");
				System.out.println("Your current score is " + score);
				System.out.println("You have chose " + low + " Low risks");
				System.out.println("You have chose " + med + " Medium risks");
				System.out.println("You have chose " + hi + " High risks");

				}
		System.out.println("_______________________________________________________________________________________________________________________________________________");	
//_____________________________________________________________________________________________________________________________________________________________________________
		//Question number 7

			String Low7 = "Tell your manager immediately";
			String Med7 = "Don't say anything";
			String Hi7 ="Steal some money too";
		  
		System.out.println("                                 You see a coworker steal some money from the register, what do you do?  ");
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
		}
		else if (med >= 7){
			System.out.println("You have failed the game, try again");
		}
		
		else if (score >= 1500){
			System.out.println("You have risked your way through the game, congradulations");
		}
		else {
			System.out.println(" ");
			System.out.println("Your current score is " + score);
			System.out.println("You have chose " + low + " Low risks");
			System.out.println("You have chose " + med + " Medium risks");
			System.out.println("You have chose " + hi + " High risks");

			}
	System.out.println("_______________________________________________________________________________________________________________________________________________");





	}
}
