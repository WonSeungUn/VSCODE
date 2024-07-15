package kosa.mission;

import java.util.Scanner;

public class Mission2_3 {

	public static int solution(int arr[]) {
		int answer = 1;
		int max = arr[0];
		for(int i = 1; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				answer++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// N명의 학생을 일렬로 세웠다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때
		// 맨 앞에 서 있는 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하시오.
		// 앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않는다.
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int arr[] = new int[num];
		
		for(int i = 0 ; i< arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(solution(arr));	
		
	}

}






















