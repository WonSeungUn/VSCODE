package kosa.oop4;

interface A1 {
	B1 abc();
}

class B1 {
	B1(){
		System.out.println("B 생성자");
	}
}

public class Main3 {

	public static void main(String[] args) {
		// 1. 익명 내부클래스
		A1 a1 = new A1() {

			@Override
			public B1 abc() {
				return new B1();
			}
			
		};
		a1.abc();
		
		// 2. 람다식
		A1 a2 = () -> {
			return new B1();
		};
		a1.abc();
		
		// 3. 인스턴스 참조
		A1 a3 = B1::new;
		a3.abc();
	}

}
