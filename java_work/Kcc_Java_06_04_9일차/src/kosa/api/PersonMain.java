package kosa.api;

public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿", 20);
		Person p2 = new Person("ȫ�浿", 20);
		
		// == : �ּҰ��� ������ ��
		if(p1 ==p2) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
		
		// equals : ���⼭�� equals�� object�� equals���� �ּҰ��� ������ ���ϴ� ���� �ȴ�. 
		// => Person�� ���� ���� ���Ϸ��� Object�� equals �޼ҵ带 �������̵� �ؾ���
		if(p1.equals(p2)) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
		
		// ��ü�� () �ȿ� �־��ָ� toString() �޼ҵ带 �ڵ����� �������ش�.
		// Object �� toString �޼ҵ带 ȣ������ => �̰ɷ� ���� �ּҰ��� ��µ�
		// p1�� ���� ���� ���� �ʹٸ� Person Ŭ�������� Object �� toString �޼ҵ带 �������̵��ؼ� ���������ָ� �ȴ�.
		System.out.println(p1);
	}
}
