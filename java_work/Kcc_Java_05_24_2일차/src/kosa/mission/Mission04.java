package kosa.mission;

import java.util.Scanner;

public class Mission04 {

	public static void main(String[] args) {
		// ���ڿ� ��
		// �ּҰ��� ����! 
		// ���� ������ ���� �ƴ� ������ �ּҰ��� ���ִ�.
		String aa = "abc";
		String bb = "abc";
		
		
		// ���� if ���ǹ��� �ּҰ��� ���ϴ� ���ǹ��� ����̱� ������ ���ٴ°� ���´�.
		if(aa==bb) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
		
		// ���� ����Ǿ��ִ� ���� ����
		if(aa.equals(bb)) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
		
		// �� ������ ������ ���ڿ��� �Է¹޾�
		// ��Ģ ���� ����� ����Ͻÿ�. (����)
		// ex) ���� 1 : 10
		// ex) ���� 2 : 20
		// ������ : +
		// ��� > 30
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 1 :");
		int a = sc.nextInt();
		
		System.out.print("���� 2 :");
		int b = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("������ :");
		String oper = sc.nextLine();
		double result =0;
		
		if(oper.equals("+")) {
			result = a + b;
		} else if(oper.equals("-")) {
			result = a - b;
		} else if(oper.equals("*")) {
			result = a * b;
		} else if(oper.equals("/")) {
			result = a / b ;
		} else {
			System.out.println("�߸��� �����Դϴ�.");
		}
		System.out.println(result);

		
	}

}
