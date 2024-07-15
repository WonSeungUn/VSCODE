package kosa.mission;

import java.util.Scanner;

public class Mission2_5 {
	
	public static int solution(int n, int arr[][]) {
		int answer = 0;
		int sum1 = 0;  // ���� ���� ���
		int sum2 = 0;  // ���� ���� ���
		
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
		// ù �ٿ� �ڿ��� N�� �־�����
		// �ι�° �ٺ��� N�ٿ� ���� �� �ٿ� N���� �ڿ����� �־�����. �� �ڿ����� 100�� ���� �ʴ´�.
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
