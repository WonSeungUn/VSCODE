package kosa.oop3;

public class Main {
	public static void main(String[] args) {
		Person p = new Person("원승언", new Student());
		Person p1 = new Person("아부지", new Work());
		Person p2 = new Person("운전기사", new Role() {

			@Override
			public void doing() {
				System.out.println("드라이빙 역할");
			}
			
		});
		p.printRole();
		p1.printRole();
		p2.printRole();
	}
}
