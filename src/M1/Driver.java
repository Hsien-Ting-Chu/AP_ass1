package M1; // Class Author : Chris

import java.util.*;

public class Driver {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Driver driver = new Driver();
		driver.menu();
		driver.selection();
	}

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

	public int selection() {
		int selection = 0;
		boolean validInput = false;
		do {
			validInput = true;
			try {
				selection = sc.nextInt();
			} catch (Exception e) {
				validInput = false;
				// sc.next();
			}
			if (selection < 0 || selection > 6) {
				System.out.print("\n========Your input: " + sc.next() + " is invalid========\n\n");
				menu();
			}

		} while (!validInput || selection < 0 || selection > 6);
		return selection;
	}
}
