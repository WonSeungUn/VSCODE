package kosa.baseball;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Baseball1 b = new Baseball1();
		Scanner sc = new Scanner(System.in);
		int temp[] = new int[3];
		int count =0;
		System.out.println("< ���ӽ��� >");
		
		do {
			System.out.print("���ڸ� �Է��Ͻÿ� >");
			for(int i = 0 ; i<3; i++) {
				 temp[i] = sc.nextInt();
			}
			b.strike(temp);
			b.ball(temp);
			System.out.println("S: " + b.getStrike()+"\t" + "B: " +b.getBall());
			count++;
		} while (b.getStrike()<3);
		System.out.println(count + " ��° ����!!");
	}
}
