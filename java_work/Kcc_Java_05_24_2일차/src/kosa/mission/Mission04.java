package kosa.mission;

import java.util.Scanner;

public class Mission04 {

	public static void main(String[] args) {
		// 문자열 비교
		// 주소값은 같다! 
		// 실제 데이터 값이 아닌 참조형 주소값이 들어가있다.
		String aa = "abc";
		String bb = "abc";
		
		
		// 지금 if 조건문은 주소값을 비교하는 조건문의 경우이기 때문에 같다는게 나온다.
		if(aa==bb) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		// 직접 저장되어있는 값을 비교함
		if(aa.equals(bb)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		// 두 정수와 연산자 문자열을 입력받아
		// 사칙 연산 결과를 출력하시오. (계산기)
		// ex) 정수 1 : 10
		// ex) 정수 2 : 20
		// 연산자 : +
		// 결과 > 30
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 1 :");
		int a = sc.nextInt();
		
		System.out.print("정수 2 :");
		int b = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("연산자 :");
		String oper = sc.nextLine();
		double result =0;
		
		if(oper.equals("+")) {
			result = a + b;
		} else if(oper.equals("-")) {
			result = a - b;
		} else if(oper.equals("*")) {
			result = a * b;
		} else if(oper.equals("/")) {
			result = a / b ;
		} else {
			System.out.println("잘못된 선택입니다.");
		}
		System.out.println(result);

		
	}

}
