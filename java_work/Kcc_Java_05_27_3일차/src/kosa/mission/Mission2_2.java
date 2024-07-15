package kosa.mission;

import java.util.Scanner;

public class Mission2_2 {
	
	public static int[] solution(int arr[]) {
		int answer[] = new int[arr.length];
		int count = 0;
		
		answer[count++] = arr[0];
		for(int i =1; i<arr.length ; i++) {
			if(arr[i] > arr[i-1]) {
				answer[count++] = arr[i];
			}
		}
		
		int answer2[] = new int [count];
		
		System.arraycopy(answer,0,answer2,0,count);
		
//		for(int i=0; i<count;i++) {
//			answer2[i] = answer[i];
//		}
		
		return answer2;
	}
	
	public static void main(String[] args) {
		// N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램 작성
		// 단, 첫번쨰 수는 무조건 출력한다.
		// 첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int arr[] = new int[num];
		
		for(int i=0; i<arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
		int answer[] = solution(arr);
		for(int i=0 ; i<answer.length ; i++) {
			System.out.print(answer[i] + " ");
		}
		
	}

}
