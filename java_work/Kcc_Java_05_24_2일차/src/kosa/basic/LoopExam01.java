package kosa.basic;

import java.util.Scanner;

public class LoopExam01 {

	public static void main(String[] args) {
		// while : 초기식 -> 조건식 -> 명령문 -> 증감식 : 수직방향처리
		// 1~10까지의 합
//		int sum = 0;
//		int i=1;
//		while(i<=10) {
//			sum += i;
//			i++;
//		}
//		System.out.println("1~10까지의 합 : " +sum);
	
		// 퀴즈> 구구단 7단 출력
		// 7*1 = 7
		// 7*2 = 14 형식으로
		
//		int a = 1;
//		while(a<=9) {
//			System.out.println("7 * " + a + "=" + (7*a));
//			a++;
//		}
		
		
		// for문 : 초기식 -> 조건식 -> 명령문 -> 증감식 : 수평방향
//		int sum = 0;
//		for(int i=0; i<=10; i++) {
//			sum += i;
//		}
//		System.out.println("1~10까지의 합 : " +sum);
	
	
		// 퀴즈> 1에서 100까지 2의 배수와 3의 배수가 아닌 숫자만 출력하시오.
		
//		for(int i =1; i<=100 ; i++) {
//			if(i%2 !=0 && i%3 !=0) {
//				System.out.println(i);
//			}
//		}
		
		// continue를 사용하여 1에서 100까지 2의 배수와 3의 배수가 아닌 숫자 출력
//		for(int i =1 ;i <=100 ; i++) {
//			if(i%2 ==0 || i%3 ==0) {
//				continue;
//			}
//			System.out.println(i);
//		}
		
		// do~while : 명령문을 적어도 무조건 1번을 시작해야할 떄 사용
		// 키보드로부터 숫자를 입력 받기
		// 음수를 입력하면 새로 입력 받도록 하기 위함
//		Scanner sc = new Scanner(System.in);
//		int n = 0;
//		
//		do {
//			System.out.print("입력: ");
//			n =sc.nextInt();
//		} while(n < 0);
//		
//		System.out.println("입력 결과 :" + n);
	
		
		// 2개의 정수를 입력 받아 b -a 결과 출력 하자
		// b > a 되도록 입력 => a 가 b보다 크면 새로 입력받기!
		
//		Scanner sc = new Scanner(System.in);
//		int a = 0;
//		int b = 0;
//		do {
//			System.out.print("a 입력 :");
//			a= sc.nextInt();
//			System.out.print("b 입력 :");
//			b= sc.nextInt();
//		} while(a>b);
//		System.out.println("입력결과 : " + (b-a));
		
		
		// 퀴즈3> 임의의 난수 3개를 받아서 서로 중첩되지 않고 출력하기
		
//		int a,b,c;
//		
//		a= (int)(Math.random() * 9) +1;
//		
//		do {
//			b = (int)(Math.random() * 9) +1;
//		} while(a==b);
//		
//		do {
//			c= (int)(Math.random() * 9) +1;
//		} while(a==c || b==c);
//		
//		System.out.println(a+ "," + b + "," + c);
		
		
	}

}
