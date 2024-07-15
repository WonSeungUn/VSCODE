package kosa.mission.interface00;

public class Reader extends Man implements Speakable {

	public Reader(String name) {
		super(name);
	}

	@Override
	public String speak() {
		System.out.println(getName() + " 자바 화이팅");
		return getName();
	}

}
