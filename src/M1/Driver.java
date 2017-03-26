package M1;

// Class Author : Hsienting Chu
import java.util.*;
import M2.*;

public class Driver {
	static Scanner sc = new Scanner(System.in);

	// Define all option's range
	final int startup_menu_min = 0;
	final int startup_menu_max = 6;
	final int optionOne_menu_min = 0;
	final int optionOne_menu_max = 4;
	final int athletes_num_start = 0;
	final int athletes_num_range = 8;

	boolean end = false;
	// Create 10 participants in each type respectively, and put them all in a same ArryaList
	public void initialisation() { 
		
		ArrayList<Athlete> athleteslist = new ArrayList<>(); 
		athleteslist.add(new Cyclist("AC01", 20, "Connor", "VIC"));
		athleteslist.add(new Cyclist("AC02", 25, "Noah", "TAS"));
		athleteslist.add(new Cyclist("AC03", 23, "Ebony", "QLD"));
		athleteslist.add(new Cyclist("AC04", 22, "Caitlyn", "VIC"));
		athleteslist.add(new Cyclist("AC05", 26, "Taylor", "WA"));
		athleteslist.add(new Cyclist("AC06", 29, "Alice", "NSW"));
		athleteslist.add(new Cyclist("AC07", 31, "Mark", "NSW"));
		athleteslist.add(new Cyclist("AC08", 18, "Hugo", "VIC"));
		athleteslist.add(new Cyclist("AC09", 27, "Ava", "WA"));
		athleteslist.add(new Cyclist("AC10", 29, "Steph", "SA"));

		athleteslist.add(new Swimmer("AS01", 22, "Ann", "NSW"));
		athleteslist.add(new Swimmer("AS02", 19, "Emma", "VIC"));
		athleteslist.add(new Swimmer("AS03", 21, "Derek", "SA"));
		athleteslist.add(new Swimmer("AS04", 26, "Eric", "QLD"));
		athleteslist.add(new Swimmer("AS05", 21, "Jack", "SA"));
		athleteslist.add(new Swimmer("AS06", 35, "Liam", "WA"));
		athleteslist.add(new Swimmer("AS07", 33, "Matt", "VIC"));
		athleteslist.add(new Swimmer("AS08", 18, "Kaite", "WA"));
		athleteslist.add(new Swimmer("AS09", 25, "Patrick", "SA"));
		athleteslist.add(new Swimmer("AS10", 24, "Ethan", "QLD"));

		athleteslist.add(new Sprinter("AR01", 30, "Josh", "TAS"));
		athleteslist.add(new Sprinter("AR02", 23, "Harry", "VIC"));
		athleteslist.add(new Sprinter("AR03", 26, "Chloe", "QLD"));
		athleteslist.add(new Sprinter("AR04", 32, "Julia", "NSW"));
		athleteslist.add(new Sprinter("AR05", 29, "Isabella", "SA"));
		athleteslist.add(new Sprinter("AR06", 31, "Claire", "WA"));
		athleteslist.add(new Sprinter("AR07", 25, "Tom", "WA"));
		athleteslist.add(new Sprinter("AR08", 19, "Kyle", "QLD"));
		athleteslist.add(new Sprinter("AR09", 18, "Sean", "VIC"));
		athleteslist.add(new Sprinter("AR10", 19, "Nick", "VIC"));
		
		athleteslist.add(new SuperAthlete("AA01", 32, "Alexis", "QLD"));
		athleteslist.add(new SuperAthlete("AA02", 26, "Flynn", "NWS"));
		athleteslist.add(new SuperAthlete("AA03", 28, "Archie", "VIC"));
		athleteslist.add(new SuperAthlete("AA04", 18, "Oscar", "TAS"));
		athleteslist.add(new SuperAthlete("AA05", 24, "Sebastian", "SA"));
		athleteslist.add(new SuperAthlete("AA06", 30, "Braxton", "SA"));
		athleteslist.add(new SuperAthlete("AA07", 22, "Jaxon", "TAS"));
		athleteslist.add(new SuperAthlete("AA08", 21, "Eli", "NSW"));
		athleteslist.add(new SuperAthlete("AA09", 25, "Logan", "WA"));
		athleteslist.add(new SuperAthlete("AA10", 24, "Husdon", "TAS"));
		
		Official[] official = new Official[10];
		official[0] = new Official("OF01", 30, "Jordan", "NSW");
		official[1] = new Official("OF02", 35, "Andrew", "QLD");
		official[2] = new Official("OF03", 41, "Jacob", "VIC");
		official[3] = new Official("OF04", 36, "Hayley", "WA");
		official[4] = new Official("OF05", 29, "Olivia", "NSW");
		official[5] = new Official("OF06", 34, "Chris", "QLD");
		official[6] = new Official("OF07", 48, "Max", "SA");
		official[7] = new Official("OF08", 51, "Dan", "WA");
		official[8] = new Official("OF09", 53, "Jasper", "VIC");
		official[9] = new Official("OF10", 43, "Amber", "NSW");
	}		
/*	public void initialisation_orgin() { 		
		Cyclist[] cyclist = new Cyclist[10];
		cyclist[0] = new Cyclist("AC01", 20, "Connor", "VIC");
		cyclist[1] = new Cyclist("AC02", 25, "Noah", "TAS");
		cyclist[2] = new Cyclist("AC03", 23, "Ebony", "QLD");
		cyclist[3] = new Cyclist("AC04", 22, "Caitlyn", "VIC");
		cyclist[4] = new Cyclist("AC05", 26, "Taylor", "WA");
		cyclist[5] = new Cyclist("AC06", 29, "Alice", "NSW");
		cyclist[6] = new Cyclist("AC07", 31, "Mark", "NSW");
		cyclist[7] = new Cyclist("AC08", 18, "Hugo", "VIC");
		cyclist[8] = new Cyclist("AC09", 27, "Ava", "WA");
		cyclist[9] = new Cyclist("AC10", 29, "Steph", "SA");

		Swimmer[] swimmer = new Swimmer[10];
		swimmer[0] = new Swimmer("AS01", 22, "Ann", "NSW");
		swimmer[1] = new Swimmer("AS02", 19, "Emma", "VIC");
		swimmer[2] = new Swimmer("AS03", 21, "Derek", "SA");
		swimmer[3] = new Swimmer("AS04", 26, "Eric", "QLD");
		swimmer[4] = new Swimmer("AS05", 21, "Jack", "SA");
		swimmer[5] = new Swimmer("AS06", 35, "Liam", "WA");
		swimmer[6] = new Swimmer("AS07", 33, "Matt", "VIC");
		swimmer[7] = new Swimmer("AS08", 18, "Kaite", "WA");
		swimmer[8] = new Swimmer("AS09", 25, "Patrick", "SA");
		swimmer[9] = new Swimmer("AS10", 24, "Ethan", "QLD");

		Sprinter[] sprinter = new Sprinter[10];
		sprinter[0] = new Sprinter("AR01", 30, "Josh", "TAS");
		sprinter[1] = new Sprinter("AR02", 23, "Harry", "VIC");
		sprinter[2] = new Sprinter("AR03", 26, "Chloe", "QLD");
		sprinter[3] = new Sprinter("AR04", 32, "Julia", "NSW");
		sprinter[4] = new Sprinter("AR05", 29, "Isabella", "SA");
		sprinter[5] = new Sprinter("AR06", 31, "Claire", "WA");
		sprinter[6] = new Sprinter("AR07", 25, "Tom", "WA");
		sprinter[7] = new Sprinter("AR08", 19, "Kyle", "QLD");
		sprinter[8] = new Sprinter("AR09", 18, "Sean", "VIC");
		sprinter[9] = new Sprinter("AR10", 19, "Nick", "VIC");

		SuperAthlete[] superAthlete = new SuperAthlete[10];
		superAthlete[0] = new SuperAthlete("AA01", 32, "Alexis", "QLD");
		superAthlete[1] = new SuperAthlete("AA02", 26, "Flynn", "NWS");
		superAthlete[2] = new SuperAthlete("AA03", 28, "Archie", "VIC");
		superAthlete[3] = new SuperAthlete("AA04", 18, "Oscar", "TAS");
		superAthlete[4] = new SuperAthlete("AA05", 24, "Sebastian", "SA");
		superAthlete[5] = new SuperAthlete("AA06", 30, "Braxton", "SA");
		superAthlete[6] = new SuperAthlete("AA07", 22, "Jaxon", "TAS");
		superAthlete[7] = new SuperAthlete("AA08", 21, "Eli", "NSW");
		superAthlete[8] = new SuperAthlete("AA09", 25, "Logan", "WA");
		superAthlete[9] = new SuperAthlete("AA10", 24, "Husdon", "TAS");
		
		Official[] official = new Official[10];
		official[0] = new Official("OF01", 30, "Jordan", "NSW");
		official[1] = new Official("OF02", 35, "Andrew", "QLD");
		official[2] = new Official("OF03", 41, "Jacob", "VIC");
		official[3] = new Official("OF04", 36, "Hayley", "WA");
		official[4] = new Official("OF05", 29, "Olivia", "NSW");
		official[5] = new Official("OF06", 34, "Chris", "QLD");
		official[6] = new Official("OF07", 48, "Max", "SA");
		official[7] = new Official("OF08", 51, "Dan", "WA");
		official[8] = new Official("OF09", 53, "Jasper", "VIC");
		official[9] = new Official("OF10", 43, "Amber", "NSW");

	}*/

	// printout a main menu
	private void Startup_menu() {
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

	// printout a option 1 menu
	private void optionOne_menu() {
		System.out.println("Please choose a game");
		System.out.println("1. Swimming");
		System.out.println("2. Cycling");
		System.out.println("3. Running");
		System.out.print("Enter an option: ");
	}


	private int selection() {
		boolean validInput = false;
		int selection = 0; // initial selection
		while (!validInput) {
			Startup_menu();
			if (sc.hasNextInt()) {
				selection = sc.nextInt();
				if (startup_menu_min > selection || selection > startup_menu_max) {
					System.out.print("\n========Your input: " + selection + " is invalid========\n\n");
					selection = 0; // initial selection
				} else {
					validInput = true;
				}
			} else
				System.out.print("\n========Your input: " + sc.next() + " is invalid========\n\n");
		}
		return selection;
	}

	private int chooseGame() {
		boolean validInput = false;
		int chooeseGame = 0; // initial gameType
		while (!validInput) {
			Startup_menu();
			if (sc.hasNextInt()) {
				chooeseGame = sc.nextInt();
				if (optionOne_menu_min > chooeseGame || chooeseGame > optionOne_menu_max) {
					System.out.print("\n========Your input: " + chooeseGame + " is invalid========\n\n");
					chooeseGame = 0; // initial gameType
				} else {
					validInput = true;
				}
			} else
				System.out.print("\n========Your input: " + sc.next() + " is invalid========\n\n");
		}
		return chooeseGame;
	}

	private void setGame() {
		int chooseGame = chooseGame();
		String gameID;
		int gameNum = 0;

		switch (chooseGame) {
		case 1:
			gameID = "S" + (gameNum < 10 ? "0" : "") + gameNum;
			Swimming swimming = new Swimming(gameID);
			gameNum++;
			break;
		case 2:
			gameID = "C" + (gameNum < 10 ? "0" : "") + gameNum;
			Cycling cycling = new Cycling(gameID);
			gameNum++;
			break;
		case 3:
			gameID = "R" + (gameNum < 10 ? "0" : "") + gameNum;
			Running running = new Running(gameID);
			gameNum++;
			break;
		}
	}

	private void chooseAthletes() {
		Random r = new Random();
		int athletesNum = r.nextInt(athletes_num_range) + athletes_num_start;
		if(athletesNum < 4) {
			
		}else if(athletesNum >4) {
			
		}


		
		
	}

	private void prediction() {

	}

	private void startGame() {
		
	}

	private void displayReuslt() {

	}

	private void displayPoints() {

	}

	public void runGame() {
		initialisation();
		while (!end) {
			int selection = selection();
			switch (selection) {
			case 1:
				optionOne_menu();
				chooseGame();
				setGame();
				chooseAthletes();
				break;
			case 2:
				prediction();
				break;
			case 3:
				startGame();
				
				break;
			case 4:
				displayReuslt();
				break;
			case 5:
				displayPoints();
				break;
			case 6:
				end = true;
				break;
			}
		}

	}

}
