package kosa.mission;

import java.util.Scanner;

public class Mission02 {

	public static void main(String[] args) {
		// �������� ����
		// ����, ����, ���� ������ Ű����κ��� �Է¹޾� ������ ����� ����ϱ� (��. ����� �Ǽ���)

		Scanner sc = new Scanner(System.in);

		System.out.print("���� ���� :");
		int kor = sc.nextInt();
		System.out.print("���� ���� :");
		int eng = sc.nextInt();
		System.out.print("���� ���� :");
		int math = sc.nextInt();

		int total = kor + eng + math;
		System.out.println("���� :" + total + "��");
		int avg = (int) (total / 3.0);
		System.out.println(avg);

		// ���� 90 �̻� => A����
		// ���� 80 �̻� => B����
		// ���� 70 �̻� => C����
		// ���� 60 �̻� => D����

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
