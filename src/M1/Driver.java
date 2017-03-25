package M1; 
// Class Author : Hsienting Chu
import java.util.*;

public class Driver {
	static Scanner sc = new Scanner(System.in);
	boolean end = false;

// Create a menu list 
	public void menu() {   
		System.out.println("Ozlympic Game");
		System.out.println("===================================");
		System.out.println("1. Select a game to run");
		System.out.println("2. Predict the winner of the game");
		System.out.println("3. Start the game");
		System.out.println("4. Display the final results of all games");
		System.out.println("5. Display the points of all athletes");
		System.out.println("6. Exit");
		System.out.print("Enter an option: ");

	}
	
	public void menu_selection1(){
		System.out.println("Please choose a game");
		System.out.println("1. Swimming");
		System.out.println("2. Cycling");
		System.out.println("3. Running");
		System.out.println("4. Previous menu");
	}
	
//	public void menu_selection2(){
//		for (int i<0 ; i<x.length ;i++){
//			
//		}
//	}
	

	public int selection() {
		int selection = 0;
		boolean validInput = false;
		do {
			menu();
			validInput = true;
			try {
				selection = sc.nextInt();
			} catch (Exception e) {
				validInput = false;
				System.out.print("\n========Your input: " + sc.next() + " is invalid========\n\n");
				sc.next();
			}
			if (selection < 0 || selection > 6) {
				System.out.print("\n========Your input: " + selection + " is invalid========\n\n");
			}

		} while (!validInput || selection < 0 || selection > 6);
		return selection;
	}

	public void runGame() {
		while(!end){
			
		}
		
	}

}
