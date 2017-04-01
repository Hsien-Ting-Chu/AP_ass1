package M1;

/**
 * @author Hsienting Chu
 *
 */
import java.util.ArrayList;
import java.util.List;

import M2.Athlete;
import M2.Official;
import M2.Participant;

public abstract class Game {

	private static final int athleteNum_min = 4;

	private String ID;
	private String type;
	private Official referee;
	private boolean cancelled = false;
	private List<Athlete> athletes;
	private List<Athlete> result;

	abstract protected boolean checkIsMatch(Athlete athlete);

	public Game(String ID, String type, List<Athlete> athletes, Official referee) {
		this.ID = ID;
		this.type = type;
		this.referee = referee;
		for (Athlete athlete : athletes) {
			if (!checkIsMatch(athlete)) {
				athletes.remove(athletes);
			}
		}
		if (athletes.size() < athleteNum_min) {
			System.out.println(athletes.size());
			cancelled = true;
			return;
		}

	}

	// Start game
	public void start() {
		// Initialize referee from previous game
		System.out.println("type = " + type);
		referee.initNewGame();
		System.out.println("init game");
		for (Athlete athlete : athletes) {
			System.out.println("init game");
			// Call each athlete in athletes list to start the game
			// getCompeter is to get the right type of superAthlete and produce right random seconds
			referee.addScore(athlete, athlete.getCompeter(type).compete());
		}
		// To summarise score of top3 winner
		System.out.println("summarise game");
		referee.summarise();
		// Return the result 
		System.out.println("result of game");
		result = referee.getResult();
	}

	public List<Participant> getPrintResult() {
		List<Participant> pList = new ArrayList<Participant>();
		pList.add(referee);
		pList.add(result.get(0));
		pList.add(result.get(1));
		pList.add(result.get(2));
		return pList;
	}

	public String getID() {
		return ID;
	}

	public String getType() {
		return type;
	}

	public Official getReferee() {
		return referee;
	}

	public boolean isCancelled() {
		return cancelled;
	}

	public List<Athlete> getAthletes() {
		return athletes;
	}

	public List<Athlete> getResult() {
		return result;
	}
}
