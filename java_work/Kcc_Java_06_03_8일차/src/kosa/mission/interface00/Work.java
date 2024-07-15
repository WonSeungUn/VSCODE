package kosa.mission.interface00;

public class Work extends Man implements Speakable {

	public Work(String name) {
		super(name);
	}
	
	@Override
	public String speak() {
		System.out.println(getName() + " 열심히 일해야 한다.");
		return getName();
	}

}
