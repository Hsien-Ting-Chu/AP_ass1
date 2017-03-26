package M2;

//Class Author : Haifan Wang 
public abstract class Participant {
	private String ID;
	private int age;
	private String name;
	private String state;

	public Participant(String ID, int age, String name, String state) {
		this.ID = ID;
		this.age = age;
		this.name = name;
		this.state = state;

	}

	public String getID() {
		return ID;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getState() {
		return state;
	}
	
	
	
}
