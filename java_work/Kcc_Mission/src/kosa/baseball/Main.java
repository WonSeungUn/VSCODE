package kosa.baseball;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Baseball b = new Baseball();
		Scanner sc = new Scanner(System.in);
		
		int strike = 0;
		int ball = 0;
		int count = 0;
		int input[] = new int[3]; 
		
		do {
			System.out.println("���ӵ���");
			System.out.print("���� �Է�(3�ڸ�) >");
			for(int i = 0 ; i < 3 ; i++) {
				input[i] = sc.nextInt();
			}
			
			strike = b.countStrike(input);
			ball = b.countBall(input);
			System.out.println(strike + "S" + ball + "B");
			count++;
			
		} while (strike != 3);
		System.out.println(count + "��°�� �����߽��ϴ�!!");
	}
}