package kosa.mission.interface00;

public class Main {

	public static void main(String[] args) {
		Object obj[] = {
				new Reader("�Ѹ�"),
				new Work("�浿"),
				new Student("������")
		};
		
		for(int i = 0 ; i<obj.length ; i++) {
			if(obj[i] instanceof Speakable) {
				((Speakable)(obj[i])).speak();
			}
		}
	}

}
