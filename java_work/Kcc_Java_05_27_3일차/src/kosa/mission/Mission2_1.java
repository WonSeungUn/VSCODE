package kosa.mission;

import java.util.Scanner;

public class Mission2_1 {

	public static void average(int arr[]) {
		arr[4] = arr[3] /3;
	}
	
	public static void main(String[] args) {
		// ����, ����, ���� => Ű����� �Է¹޾� �迭�� ��������
		// ����, ��� ���ϱ� => �޼��� ���� ����
		Scanner sc = new Scanner(System.in);
		String subject[] = {"����", "����", "����"};
		int arr[] = new int[5];
		
		for(int i=0 ; i<subject.length; i++) {
			System.out.print(subject[i] + "�Է� : ");
			arr[i] = sc.nextInt();
			arr[3] += arr[i];
		}
		
		average(arr);
		
		System.out.println("����\t����\t����\t����\t���");
		for(int n : arr) {
			System.out.print(n + "\t");
		}
		

	}

}
