package M2;

public abstract class Athlete extends Participant implements ICompetable {
	private int points = 0;

	public Athlete(String ID, int age, String name, String state) {
		super(ID, age, name, state);
	}

	@Override
	public abstract int compete();
	
	//取得競爭者，通常就是自己
	//多這個是為了讓有三個分身的SuperAthelet用
	public ICompetable getCompeter(String gameType) {
		return this;
	}
	
	public void addPoints(int points){
		this.points += points;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
}
