package kosa.oop4;

public class Main {

	public static void main(String[] args) {
		// MyType => 익명내부클래스로 구현
		MyType mt = new MyType() {
			
			@Override
			public void hello() {
				System.out.println("안녕하세요");
			}
			
		};
		mt.hello();
		
		// 람다식으로 구현 (주의사항 : 추상 메서드가 1개일 때 가능)
		MyType mt2 = () -> {
			System.out.println("람다식 형식입니다.");
		};
		mt2.hello();
		
		MyType mt3 = () -> System.out.println("람다식 2번째 형식이다");
		mt3.hello();
		
		YourType you = (String message) -> {
			System.out.println("메세지 : " + message);
		};
		
		you.talk("안녕");
		
		YourType you2 = message -> System.out.println("메세지 :" + message);
		you2.talk("hello");
		
		// 해당하는 MyNumber 추상메서드 구현(람다식)
		MyNumber mn = (num1,num2) -> {return Math.max(num1, num2);};
		System.out.println(mn.getMax(5,1));
		
		// Runnable 람다식 구현
		Runnable r = () -> {
			for(int i = 1 ; i<=10 ; i++) {
				try {
					Thread.sleep(1000);
				} catch (Exception e) {}
				System.out.println(i);
			}
		};
		
		Thread t = new Thread(r);
		t.start();
	}

}
