package kosa.mission;

import java.util.Scanner;

public class Mission2_6 {
	
	public static void main(String[] args) {
		// ������ ����
		
		// ����ڷκ��� Ű���� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		
		// Ű���� �Է��� �޴µ�, ���ڷ� �Է� �ޱ�
		int t = sc.nextInt();
		
		
		// ��¥ ���� ���� �ʱ�ȭ
		int day = 0;
		
		for(int i=1; i<=t; i++) {
			// �˻��� ���� ������ ��¥�� �ʱ�ȭ�Ͽ��� �Ѵ�.
			day = 0;
			// �������� ������ Ű����� �Է� �ޱ�
			int a = sc.nextInt();
			// �������� ������ Ű����� �Է� �ޱ�
			int b = sc.nextInt();
			
			// �������� ���� ������ multiA�� ����
			int multiA = a;
			// �������� ���� ������ multiB�� ����
			int multiB = b;
			// �߰� ������ ���� �� ����� �ΰ� ���� ���� ����! i<���� �̷� �������� ������
			// multiA�� multiB���� Ŭ������ for�� �ݺ�
			for(int j =1; multiA>=multiB; j++) {
				// �������� ������ 2�辿 �����Ѵٴ� �ǹ�
				multiA *= 2;
				// �������� ������ 3�辿 �����Ѵٴ� ��
				multiB *= 3;
				// for���� �ѹ� ���������� day�� 1������!
				day++;
				System.out.println(multiA + " " + multiB);
				
			}
			System.out.println();
			// for���� ���� ������ day�� ���� ���´�!
			System.out.print("#"+i+ "\t" +day + "\n");
			
		}
	}

}
