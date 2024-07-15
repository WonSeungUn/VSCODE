package kosa.mission;

import java.util.Scanner;

public class Mission2_6 {
	
	public static void main(String[] args) {
		// 갤러그 문제
		
		// 사용자로부터 키보드 입력 받기
		Scanner sc = new Scanner(System.in);
		
		// 키보드 입력을 받는데, 숫자로 입력 받기
		int t = sc.nextInt();
		
		
		// 날짜 숫자 변수 초기화
		int day = 0;
		
		for(int i=1; i<=t; i++) {
			// 검색이 끝날 때마다 날짜는 초기화하여야 한다.
			day = 0;
			// 종현이의 점수를 키보드로 입력 받기
			int a = sc.nextInt();
			// 종원이의 점수를 키보드로 입력 받기
			int b = sc.nextInt();
			
			// 종현이의 최초 점수를 multiA에 대입
			int multiA = a;
			// 종원이의 최초 점수를 multiB에 대입
			int multiB = b;
			// 중간 지점에 서로 비교 대상을 두고 비교할 수도 있음! i<숫자 이런 고정관념 버리셈
			// multiA가 multiB보다 클때까지 for문 반복
			for(int j =1; multiA>=multiB; j++) {
				// 종현이의 점수는 2배씩 증가한다는 의미
				multiA *= 2;
				// 종원이의 점수는 3배씩 증가한다는 뜻
				multiB *= 3;
				// for문이 한번 끝날때마다 day는 1씩증가!
				day++;
				System.out.println(multiA + " " + multiB);
				
			}
			System.out.println();
			// for문이 끝난 시점에 day의 숫자 나온다!
			System.out.print("#"+i+ "\t" +day + "\n");
			
		}
	}

}
