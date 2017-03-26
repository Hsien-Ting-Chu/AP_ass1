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
		//若參賽者太少就Cancel
		if(athletes.size() < MIN_ACEPT){
			canceled = true;
			return;
		}
		//太多人隨機剃除
		while(athletes.size() > MAX_ACEPT){
			athletes.remove((int)(athletes.size() * Math.random()));
		}
		this.athletes = athletes;
	}
	
	//開始比賽
	public void start(){
		//重設裁判，清空上一場比賽的資料，因為裁判會重複使用
		referee.initNewGame();
		for (Athlete athlete : athletes) {
			//將athlete，與取出競爭者去進行比賽
			//多了getCompeter的目的就是在SuperAthelet去將三個子athelet取出來並生出分數傳給裁判
			referee.addScore(athlete, athlete.getCompeter(type).compete());
		}
		//產生結果並加分
		referee.summarise();
		//將結果回傳
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
