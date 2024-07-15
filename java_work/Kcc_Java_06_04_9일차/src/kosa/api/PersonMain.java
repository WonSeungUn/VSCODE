package kosa.api;

public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 20);
		Person p2 = new Person("홍길동", 20);
		
		// == : 주소값이 같은지 비교
		if(p1 ==p2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		// equals : 여기서의 equals는 object의 equals여서 주소값이 같은지 비교하는 값이 된다. 
		// => Person의 값을 직접 비교하려면 Object의 equals 메소드를 오버라이딩 해야함
		if(p1.equals(p2)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		// 객체를 () 안에 넣어주면 toString() 메소드를 자동으로 생성해준다.
		// Object 의 toString 메소드를 호출했음 => 이걸로 인해 주소값이 출력됨
		// p1의 값을 직접 보고 싶다면 Person 클래스에서 Object 의 toString 메소드를 오버라이딩해서 재정의해주면 된다.
		System.out.println(p1);
	}
}
