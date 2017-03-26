package M2;

public class SuperAthlete extends Athlete {
	// Constructor
	//�T�Ӥ���
	private Swimmer swimmer;
	private Sprinter sprinter;
	private Cyclist cyclist;
	
	//��l�ƪ��ɭԲ��ͤT�Ӥ���
	public SuperAthlete(String ID, int age, String name, String state) {
		super(ID, age, name, state);
		cyclist = new Cyclist(ID, age, name, state);
		sprinter = new Sprinter(ID, age, name, state);
		swimmer = new Swimmer(ID, age, name, state);
	}
	
 	public int compete() {
 		throw new RuntimeException("���ઽ���I�s SuperAthlete ��compete�A�гz�LgetCompeter�����G�G�s");
	}

 	//�̷�gameType�^�ǯS�w���v����
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

	//�T�Ӥ������ƪ��`�X
	@Override
	public int getPoints() {
		return cyclist.getPoints() + sprinter.getPoints() + swimmer.getPoints();
	}

	
}
