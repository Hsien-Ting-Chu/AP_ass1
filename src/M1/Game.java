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

//	private static final int MAX_ACEPT = 8;
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
			cancelled = true;
			return;
		}
//		while (athletes.size() > MAX_ACEPT) {
//			athletes.remove((int) (athletes.size() * Math.random()));
//		}
//		this.athletes = athletes;
	}

	// Start game
	public void start() {
		// Initialize referee from previous game
		referee.initNewGame();
		for (Athlete athlete : athletes) {
			// �Nathlete�A�P���X�v���̥h�i�����
			// �h�FgetCompeter���ت��N�O�bSuperAthelet�h�N�T�Ӥlathelet���X�ӨåͥX���ƶǵ����P
			referee.addScore(athlete, athlete.getCompeter(type).compete());
		}
		// ���͵��G�å[��
		referee.summarise();
		// �N���G�^��
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
