package kosa.oop3;

public class Main {
	public static void main(String[] args) {
		Person p = new Person("���¾�", new Student());
		Person p1 = new Person("�ƺ���", new Work());
		Person p2 = new Person("�������", new Role() {

			@Override
			public void doing() {
				System.out.println("����̺� ����");
			}
			
		});
		p.printRole();
		p1.printRole();
		p2.printRole();
	}
}
