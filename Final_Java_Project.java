import java.util.Scanner;

class Final_Java_Project {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int score = 0;
			int low = 0;
			int med = 0;
			int hi = 0;
			int choice = 0;

			String[][] problems = {{"You are left home alone what do you do?", "Stay up past bed time", "Sneak out to go party", "Steal some of your parents alcohol"},
						{"You recieved an F on a test, what do you do?","Show your parents your report card", "Hide your report card", "Bribe your teacher"},
						{"You are given the cheat sheet for a test, what do you do?", "Throw it away and tell the teacher","Use it to get a good score on the test", "You duplicate it for everyone"},
						{"You have recieved an award by mistake, what do you do? ", "Correct the mistake", "Dont say anything","You won something, it doesn't matter how"},
						{ "You see a man drop his wallet on the street, what do you do?", "Pick it up and run it to him", "Open it and steal a $20 bill","Steal the whole wallet"},
						{"You are recieve a package in the mail that was delievered to the wrong address, what do you do?", "Return it to the post office", "Keep it without telling anyone", "Open it and keep whatever is inside"},
						{"You see a coworker steal some money from the register, what do you do? ", "Tell your manager immediately", "Don't say anything", "Steal some money too"},
						{"You discover an old my trying to cross the street, what do you do?", "Go help the man cross the street", "Walk past him", "Walk past him and push him"},
						{"You are offered to try drugs, what do you do?", "Say no and tell the police", "Just say no","Go for it, you only live once"},
						{"You are walking down the street and see a person getting mugged, what do you do?", "Run to help them while calling 911", "Call 911 and walk away", "Ignore it and get on with your day"},
						{"You see a homeless person on the side of the street, what do you do?", "Buy them some food and some warm clothes","Dig some change out of your pocket","Walk away and kick dust at them"},
						{ "While walking home you see a stray dog with a collar tag, what do you do?", "Look at the collar and call the number",  "Take the dog to the dog shelter",  "Steal the dog and take it home"}, 
						{"You are at the store and see someone knock over the whole shelf, what do you do?","Go pick it up quietly","Tell and employee","Yell at the person who knocked it over"},
						{"The neighbors garbage can fell over and trash spilled everywhere, what do you do?","Pick it up and take it to the landfill","Put it all back in the trashcan","Take it and spread the trash everywhere"},
						{"The bank teller gives you 5 $100 bills instead of 5 $10 bills, what do you do?","Correct their mistake and take the loss","Take the money","Take the money and get the teller fired"},
						{"The car in front of you catches on fire and pulls off the road, what do you do?","Stop your car and try to put the fire out", "Get all the people out, but leave the car","Drive past them without stopping"},
						{"You see a hitchhiker walking down the side of the freeway, what do you do?", "Pick them up and drop take them somewhere", "Leave them on the side of the road","Drive past them and spit on them"},
						{"You are offered a shot of vodka, what do you do?", "Say no and go home", "Try a little bit of it","How about 5 more shots"},
						{"You work at a vallet service and a nice car pulls up, what do you do?","Drive it to a parking spot and let it be","Take it on a joyride around the block","Go pick up your friends and have a party"},
						{"You see a wounded cat on the road, what do you do?","Pick it up and take it to the hospital", "Move it to the side of the road","Leave it in the middle of the road"}};

													
		
		for (int i = 0; i < problems.length; i++) {								
			System.out.println("                                               " + problems[i][0] +" ");
			System.out.println("______________________________________________________________________________________________________________________________________________");
			System.out.println("|                  Low Risk                    |                   Medium Risk                 |                 High Risk                   |");
			System.out.println("|----------------------------------------------|-----------------------------------------------|---------------------------------------------|");
			System.out.println("|                                              |                                               |                                             |");
			System.out.print(String.format("|%1$-46s", "  "+problems[i][1]));
			System.out.print(String.format("|%1$-47s", "  "+problems[i][2]));
			System.out.println(String.format("|%1$-45s|", "  "+problems[i][3]));
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
			
			if (hi >= 7 ){
				System.out.println("You have failed the game, try again"); 
				System.exit(0);
			}
			else if (med >= 10){
				System.out.println("You have failed the game, try again");
				System.exit(0);			
			}
			
			else if (score >= 2500){
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
	}			
  }
}
