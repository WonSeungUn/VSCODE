package kosa.oop;

public class MemberMain {
	public static void main(String[] args) {
		Member m1 = new Member("ȫ�浿", "010-2577-5722",24,"��⵵"); // ��ü���� => �ν��Ͻ�ȭ / m1 => �ν��Ͻ� ����
				
		Member m2 = new Member();
		m2.memberName = "ȫ�浿";
		m2.age = 24;
		m2.address = "����� ���ൿ";
		m2.phoneNumber = "010-2572-4233";
		
		
		// Ŭ������ ������ �ϳ������� ��ü�� ������ ���� ���� �ٸ� �޸𸮰� �����Ǳ� ������ ��ü�� ���� ���� �ٸ��� ���� �� �ִ� ���̴�.
		// �����δ� �޸𸮿� 2���� ������ ������ ��..!
		
		m1.printMember();
		System.out.println();
		m2.printMember();
		
	}
}
