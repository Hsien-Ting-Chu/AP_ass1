package M1;

import java.util.List;

import M2.Athlete;
import M2.Official;

public abstract class Game {
	private static final int MAX_ACEPT = 8;
	private static final int MIN_ACEPT = 4;
	
	private String ID;
	private String type;
	private Official referee;
	private boolean canceled = false;
	private List<Athlete> athletes;
	private List<Athlete> result;
	
	public Game(String ID, String type, List<Athlete> athletes, Official referee) {
		this.ID = ID;
		this.type = type;
		this.referee = referee;
		//�Y���ɪ̤ӤִNCancel
		if(athletes.size() < MIN_ACEPT){
			canceled = true;
			return;
		}
		//�Ӧh�H�H���c��
		while(athletes.size() > MAX_ACEPT){
			athletes.remove((int)(athletes.size() * Math.random()));
		}
		this.athletes = athletes;
	}
	
	//�}�l����
	public void start(){
		//���]���P�A�M�ŤW�@�����ɪ���ơA�]�����P�|���ƨϥ�
		referee.initNewGame();
		for (Athlete athlete : athletes) {
			//�Nathlete�A�P���X�v���̥h�i�����
			//�h�FgetCompeter���ت��N�O�bSuperAthelet�h�N�T�Ӥlathelet���X�ӨåͥX���ƶǵ����P
			referee.addScore(athlete, athlete.getCompeter(type).compete());
		}
		//���͵��G�å[��
		referee.summarise();
		//�N���G�^��
		result = referee.getResult();
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

	public boolean isCanceled() {
		return canceled;
	}

	public List<Athlete> getAthletes() {
		return athletes;
	}

	public List<Athlete> getResult() {
		return result;
	}
}
