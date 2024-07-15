package kosa.basic;

public class VariableExam {

	public static void main(String[] args) {	
		// 변수는 데이터를 담는 그릇 ex) 홍길동, 100, 3.14, true, false 등등
		// byte, short, int, long, float, double, boolean, char : 기본형 데이터 타입(primitive data type)
		// 기본형 데이터 타입 / 참조형 데이터 타입
		// 변수를 선언할 때는 먼저 데이터 타입을 써준다.
		// 데이터의 종류가 다양하기 때문에 데이터 타입 또한 다양하다.
		
		int num; // 변수를 선언 → 메모리 할당   // 메모리에 할당된 실제 데이터 타입을 넣는 것
		int arr[]; // 배열 선언 → Object Type
		
		// 지역 변수가 가지고 있는 특징 - local variable(지역변수) → 지역변수는 초기화해야 한다.
		
		// 대입 연산자 = : 오른쪽의 10 값을 num에 대입한다. → 변수 초기화
		num = 10;
//		System.out.println("num의 값은" + num);
	
		// 변수 선언과 초기화
		int num2 = 100;
//		System.out.println("num2의 값은" + num2);
		
		// 문자열 : String → 참조형 데이터 타입 
		// String Class
		String name = "홍길동";
//		System.out.println(name + "님");

		
		// 변수선언 주의사항
		// 변수명 : 특수문자 X , 숫자로 시작 X, 소문자 시작, _까지는 사용 가능
		
		// 100, "", true,'',3.124 → 데이터 타입 존재
		// 기본 리터럴 : 값이 가지는 데이터 타입 
		// 100 => int , "" => String, 'A' => char, true => boolean, 3.14 => double
//		float a = 3.14;
		
		// casting : 형변환
		// casting 기준 : byte < short < int < long < float < double < String
		// int <=> char
		float a1 = 3.14f;
		
		double a2 = 3.14;
		
		// 100은 기본 리터럴이 int인데 double은 int보다 casting 기준으로 크기 떄문에 괜찮다.
		// 묵시적 캐스팅의 예
		double b = 100;
		System.out.println(b);
		
		// 강제 형변환
		int c = (int)3.14;
		System.out.println(c);
		
		float num3 = 3.14f;
//		System.out.println(num3);
		
		long num4 = 100L;
//		System.out.println(num4);
		
		// num5는 8진수 010 이므로 숫자로 print하면 8이 나옴
		int num5 = 010;
//		System.out.println(num5);
		
		
	}

}
