package kosa.mission;

import java.util.Scanner;

public class Mission02 {

	public static void main(String[] args) {
		// 성적관리 구현
		// 국어, 영어, 수학 점수를 키보드로부터 입력받아 총점과 평균을 출력하기 (단. 평균은 실수형)

		Scanner sc = new Scanner(System.in);

		System.out.print("국어 점수 :");
		int kor = sc.nextInt();
		System.out.print("영어 점수 :");
		int eng = sc.nextInt();
		System.out.print("수학 점수 :");
		int math = sc.nextInt();

		int total = kor + eng + math;
		System.out.println("총점 :" + total + "점");
		int avg = (int) (total / 3.0);
		System.out.println(avg);

		// 학점 90 이상 => A학점
		// 학점 80 이상 => B학점
		// 학점 70 이상 => C학점
		// 학점 60 이상 => D학점

//		if(avg >=90) {
//			System.out.println("A");
//		} else if(avg >=80) {
//			System.out.println("B");
//		} else if(avg>=70) {
//			System.out.println("C");
//		} else if(avg >=60) {
//			System.out.println("D");
//		} else {
//			System.out.println("F");
//		}

		switch (avg/10) {
			
			case 10:
				System.out.println("A+");
				break;
			case 9:
				System.out.println("A");
				break;
				
			case 8:
				System.out.println("B");
				break;
				
			case 7:
				System.out.println("C");
				break;
				
			case 6:
				System.out.println("D");
				break;
		
			default:
				System.out.println("F");
				break;
		}

	}

}
