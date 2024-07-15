package kosa.mission;

import java.util.Scanner;

public class Mission2_1 {

	public static void average(int arr[]) {
		arr[4] = arr[3] /3;
	}
	
	public static void main(String[] args) {
		// 국어, 영어, 수학 => 키보드로 입력받아 배열로 구현하자
		// 총점, 평균 구하기 => 메서드 정의 구현
		Scanner sc = new Scanner(System.in);
		String subject[] = {"국어", "영어", "수학"};
		int arr[] = new int[5];
		
		for(int i=0 ; i<subject.length; i++) {
			System.out.print(subject[i] + "입력 : ");
			arr[i] = sc.nextInt();
			arr[3] += arr[i];
		}
		
		average(arr);
		
		System.out.println("국어\t영어\t수학\t총점\t평균");
		for(int n : arr) {
			System.out.print(n + "\t");
		}
		

	}

}
