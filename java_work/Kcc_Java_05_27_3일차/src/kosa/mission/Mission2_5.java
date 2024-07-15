package kosa.mission;

import java.util.Scanner;

public class Mission2_5 {
	
	public static int solution(int n, int arr[][]) {
		int answer = 0;
		int sum1 = 0;  // 가로 총합 계산
		int sum2 = 0;  // 세로 총합 계산
		
		for(int i = 0 ; i < n ; i++) {
			sum1 = 0;
			sum2 = 0;
			for(int j = 0 ; j < n ; j++) {
				sum1 += arr[i][j];
				sum2 += arr[j][i];
			}
			answer = Math.max(answer, sum1);
			answer = Math.max(answer, sum2);
		}
		
		sum1 = 0;
		sum2 = 0;
		
		for(int i=0; i<n; i++) {
			sum1 += arr[i][i];
			sum2 += arr[i][n-1-i];
		}

		answer = Math.max(answer, sum1);
		answer = Math.max(answer, sum2);
		
		return answer;
	}

	public static void main(String[] args) {
		// 첫 줄에 자연수 N이 주어진다
		// 두번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
		Scanner sc = new Scanner(System.in);
		
	/*  5
		10 13 10 12 15
		12 39 30 23 11
		11 25 50 53 15
		19 27 29 37 27
		19 13 30 13 19
	*/

		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		for(int i = 0; i<n ; i++) {
			for(int j = 0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(solution(n, arr));

	}

}
