package kosa.mission.interface00;

public class Reader extends Man implements Speakable {

	public Reader(String name) {
		super(name);
	}

	@Override
	public String speak() {
		System.out.println(getName() + " �ڹ� ȭ����");
		return getName();
	}

}
