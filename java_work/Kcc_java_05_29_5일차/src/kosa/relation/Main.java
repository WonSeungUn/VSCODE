package kosa.relation;

public class Main {
	public static void main(String[] args) {
		Course c1 = new Course("�����а���");
		Course c2 = new Course("���������");
		Course c3 = new Course("�����Ͱ���");
		
		Student s1 = new Student("ȫ�浿");
		Student s2 = new Student("�ڱ浿");
		
		s1.resister(c1);
		s1.resister(c2);
		
		s2.resister(c2);
		s2.resister(c3);

		s2.dropCourse(c3);
		
		s1.printMember();
		System.out.println();
		s2.printMember();
		
		System.out.println("===================");
		
		c3.printCourse();
		
	}
}
