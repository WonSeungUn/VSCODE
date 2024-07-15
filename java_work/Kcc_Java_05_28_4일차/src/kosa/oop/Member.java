package kosa.oop;

// MemberMain의 객체인 m1의 메모리가 살아있을 때까지 Member Class의 메모리는 살아있다
// m1이 null이면 Member 또한 null
public class Member {
	// 회원 정보에 대한 클래스와 객체를 생성 후 출력
	// 상태와 행동 구성
	String memberName;
	String phoneNumber;
	int age;
	String address;
	
	// 디폴트 생성자
	public Member() {
		
	}
	
	public Member(String memberName, String phoneNumber, int age, String address) {
		this.memberName = memberName;
		this.phoneNumber = phoneNumber;
		this.age = age;
		this.address = address;
	}



	public void printMember() {
		System.out.println("이름 : " + memberName);
		System.out.println("연락처 : " + phoneNumber);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
	}
}
