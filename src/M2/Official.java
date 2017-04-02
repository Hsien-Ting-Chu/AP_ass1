package M2;
//Class Author : Haifan Wang 

import java.util.*;

public class Official extends Participant {

	ArrayList<Athlete> result = new ArrayList<>();
	ArrayList<Integer> scoreList = new ArrayList<>();

	public Official(String ID, int age, String name, String state) {
		super(ID, age, name, state);
	}

	public void initNewGame() {
		result = new ArrayList<>();
		scoreList = new ArrayList<>();
	}

	public void addScore(Athlete athlete, int score) {
		for (int i = 0; i < scoreList.size(); i++) {
			if (scoreList.get(i) > score) {
				continue;
			} else {
				result.add(i, athlete);
				scoreList.add(i, score);
				break;
			}
		}
		if (!result.contains(athlete)) {
			result.add(athlete);
			scoreList.add(score);
		}
	}

	public void summarise() {
		for (int rank = 1; rank <= 3; rank++) {
			Athlete athlete = result.get(rank);
			switch (rank) {
			case 1:
				athlete.addPoints(5);
				break;
			case 2:
				athlete.addPoints(2);
				break;
			case 3:
				athlete.addPoints(1);
				break;
			default:
				break;
			}
		}
	}

	public List<Athlete> getResult() {
		return result;
	}
}
