package kosa.basic;

import java.util.Scanner;

public class VariableExam2 {

	public static void main(String[] args) {
		// 키보드로부터 데이터 입력
		Scanner sc = new Scanner(System.in);

//		System.out.print("정수 입력 : ");
//		int num = Integer.parseInt(sc.nextLine());
		// int num =sc.nextInt(); // 10 + Enter 값이 들어간다.

		// sc.nextLine();

//		System.out.print("문자열 입력 : ");
//		String str = sc.nextLine();
//		
//		System.out.println(num);
//		System.out.println(str);

		// Scanner 를 이용하여 int 변수와 String 변수를 같이 쓸 경우 String 변수는 키보드로 선언 못함.
		// 둘 다 적어서 정상적으로 print 찍기 위해서는 sc. nextLine을 한번 더 쓰거나 형변환하기

		// int <==> char
//		char ch = 'A';
//		System.out.println((int)ch);
//		char ch1 = 'B';
//		System.out.println((int)ch1);
//		char ch2 = 'Z';
//		System.out.println((int)ch2);
		
		// A ~ Z (for문 이용) 전체 출력 => 아스키 코드 값을 통해서 int → char로 변환
		for (int i =65; i<=90; i++) {
			System.out.print((char)i + " ");
		}
		
		System.out.println();
		
		// int <==> String
		String num2 ="100";
		int num3 = Integer.parseInt(num2);
		int result = num3 + 100;
		System.out.println(result);
		
		
		int num4 = 10;
		String num5 = String.valueOf(num4);
		String num6 = num4 + "";
		
		String str = 7 +"7" + 7;
		System.out.println(str);
		
		
		
	}

}
