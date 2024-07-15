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
		// N���� ������ �Է¹޾�, �ڽ��� �ٷ� �� ������ ū ���� ����ϴ� ���α׷� �ۼ�
		// ��, ù���� ���� ������ ����Ѵ�.
		// ù �ٿ� �ڿ��� N(1<=N<=100)�� �־�����, �� ���� �ٿ� N���� ������ �Էµȴ�.
		
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
