package kosa.mission.interface00;

public class Work extends Man implements Speakable {

	public Work(String name) {
		super(name);
	}
	
	@Override
	public String speak() {
		System.out.println(getName() + " ������ ���ؾ� �Ѵ�.");
		return getName();
	}

}
