package kosa.oop;

public class MemberMain {
	public static void main(String[] args) {
		Member m1 = new Member("홍길동", "010-2577-5722",24,"경기도"); // 객체생성 => 인스턴스화 / m1 => 인스턴스 변수
				
		Member m2 = new Member();
		m2.memberName = "홍길동";
		m2.age = 24;
		m2.address = "시흥시 은행동";
		m2.phoneNumber = "010-2572-4233";
		
		
		// 클래스의 변수는 하나이지만 객체가 생성될 때는 서로 다른 메모리가 생성되기 때문에 객체의 값이 서로 다르게 나올 수 있는 것이다.
		// 실제로는 메모리에 2개의 변수가 생성된 것..!
		
		m1.printMember();
		System.out.println();
		m2.printMember();
		
	}
}
