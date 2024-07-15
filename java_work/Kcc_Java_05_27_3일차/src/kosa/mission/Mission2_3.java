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
		// N���� �л��� �Ϸķ� ������. �Ϸķ� �� �ִ� �л��� Ű�� �տ������� ������� �־��� ��
		// �� �տ� �� �ִ� �������� �� �� �ִ� �л��� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// �տ� �� �ִ� ����麸�� ũ�� ���̰�, �۰ų� ������ ������ �ʴ´�.
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int arr[] = new int[num];
		
		for(int i = 0 ; i< arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(solution(arr));	
		
	}

}






















