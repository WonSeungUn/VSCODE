package kosa.basic;

import java.util.Scanner;

public class VariableExam2 {

	public static void main(String[] args) {
		// Ű����κ��� ������ �Է�
		Scanner sc = new Scanner(System.in);

//		System.out.print("���� �Է� : ");
//		int num = Integer.parseInt(sc.nextLine());
		// int num =sc.nextInt(); // 10 + Enter ���� ����.

		// sc.nextLine();

//		System.out.print("���ڿ� �Է� : ");
//		String str = sc.nextLine();
//		
//		System.out.println(num);
//		System.out.println(str);

		// Scanner �� �̿��Ͽ� int ������ String ������ ���� �� ��� String ������ Ű����� ���� ����.
		// �� �� ��� ���������� print ��� ���ؼ��� sc. nextLine�� �ѹ� �� ���ų� ����ȯ�ϱ�

		// int <==> char
//		char ch = 'A';
//		System.out.println((int)ch);
//		char ch1 = 'B';
//		System.out.println((int)ch1);
//		char ch2 = 'Z';
//		System.out.println((int)ch2);
		
		// A ~ Z (for�� �̿�) ��ü ��� => �ƽ�Ű �ڵ� ���� ���ؼ� int �� char�� ��ȯ
		for (int i =65; i<=90; i++) {
			System.out.print((char)i + " ");
		}
		
		System.out.println();
		
		// int <==> String
		String num2 ="100";
		int num3 = Integer.parseInt(num2);
		int result = num3 + 100;
		System.out.println(result);
		
		
		int num4 = 10;
		String num5 = String.valueOf(num4);
		String num6 = num4 + "";
		
		String str = 7 +"7" + 7;
		System.out.println(str);
		
		
		
	}

}
