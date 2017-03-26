package M2;

public class SuperAthlete extends Athlete {
	// Constructor
	//三個分身
	private Swimmer swimmer;
	private Sprinter sprinter;
	private Cyclist cyclist;
	
	//初始化的時候產生三個分身
	public SuperAthlete(String ID, int age, String name, String state) {
		super(ID, age, name, state);
		cyclist = new Cyclist(ID, age, name, state);
		sprinter = new Sprinter(ID, age, name, state);
		swimmer = new Swimmer(ID, age, name, state);
	}
	
 	public int compete() {
 		throw new RuntimeException("不能直接呼叫 SuperAthlete 的compete，請透過getCompeter的結果乎叫");
	}

 	//依照gameType回傳特定的競爭者
	@Override
	public ICompetable getCompeter(String gameType) {
		switch (gameType) {
		case "run":
			return sprinter;
		case "swim":
			return swimmer;
		case "cycle":
			return cyclist;
		}
		return null;
	}

	//三個分身分數的總合
	@Override
	public int getPoints() {
		return cyclist.getPoints() + sprinter.getPoints() + swimmer.getPoints();
	}

	
}
