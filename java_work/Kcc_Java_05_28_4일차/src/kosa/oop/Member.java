package kosa.oop;

// MemberMain�� ��ü�� m1�� �޸𸮰� ������� ������ Member Class�� �޸𸮴� ����ִ�
// m1�� null�̸� Member ���� null
public class Member {
	// ȸ�� ������ ���� Ŭ������ ��ü�� ���� �� ���
	// ���¿� �ൿ ����
	String memberName;
	String phoneNumber;
	int age;
	String address;
	
	// ����Ʈ ������
	public Member() {
		
	}
	
	public Member(String memberName, String phoneNumber, int age, String address) {
		this.memberName = memberName;
		this.phoneNumber = phoneNumber;
		this.age = age;
		this.address = address;
	}



	public void printMember() {
		System.out.println("�̸� : " + memberName);
		System.out.println("����ó : " + phoneNumber);
		System.out.println("���� : " + age);
		System.out.println("�ּ� : " + address);
	}
}
