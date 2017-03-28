package M2;

import M1.Driver;

public class SuperAthlete extends Athlete {
	// Constructor
	// �T�Ӥ���
	private Swimmer swimmer;
	private Sprinter sprinter;
	private Cyclist cyclist;

	// ��l�ƪ��ɭԲ��ͤT�Ӥ���
	public SuperAthlete(String ID, int age, String name, String state) {
		super(ID, age, name, state);
		cyclist = new Cyclist(ID, age, name, state);
		sprinter = new Sprinter(ID, age, name, state);
		swimmer = new Swimmer(ID, age, name, state);
	}

	public int compete() {
		throw new RuntimeException("���ઽ���I�s SuperAthlete ��compete�A�гz�LgetCompeter�����G�G�s");
	}

	// �̷�gameType�^�ǯS�w���v����
	@Override
	public ICompetable getCompeter(String gameType) {
		switch (gameType) {
		case Driver.TYPE_RUN:
			return sprinter;
		case Driver.TYPE_SWIM:
			return swimmer;
		case Driver.TYPE_CYCLE:
			return cyclist;
		}
		throw new RuntimeException("���~��gameType");
	}
}
// �T�Ӥ������ƪ��`�X
