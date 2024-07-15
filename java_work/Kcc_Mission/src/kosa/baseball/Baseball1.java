package kosa.baseball;

import java.util.Arrays;

//3���� ������ �����ϰ� 3���� ���ڸ� �Է¹޾� ���� �ڸ����� ���� ���ڰ� �ִٸ� strike �ٸ� �ڸ����� ���� ���ڰ� �ִٸ� ball�� ó���ϴ� ���α׷� �����
//3�ڸ����̹Ƿ� �迭�� �ϴ� �� ����!
//ex) ���� : 1 2 3 / �Է� : 2 2 3 => strike : 2 / ball : 1
//��Ʈ����ũ�� 3���� ������ �ݺ��ϰ� ��Ʈ����ũ�� 3�� ������ �������� ���α׷� ����
public class Baseball1 {
	private int[] random;
	private int strike;
	private int ball;
	
	public Baseball1() {
		random = new int[3];
		random[0] = (int)((Math.random()*9)+1);
		do {
			random[1] = (int)((Math.random()*9)+1);
		} while (random[0] == random[1]);
		do {
			random[2] = (int)((Math.random()*9)+1);
		} while (random[0] == random[2] || random[1] == random[2]);
		
		System.out.println(Arrays.toString(random));
	}
	
	public int strike(int[] ball) {
		for(int i = 0 ; i < 3 ; i++) {
			if(random[i] ==ball[i]) {
				strike++;
			}
		}
		System.out.println(strike);
		return strike;
	}
	

	public int ball(int[] base) {
		for(int i = 0 ; i< 3 ; i++) {
			if(random[i]==base[(i+1)%3]) ball++;
			if(random[i]==base[(i+2)%3]) ball++;
		}
		System.out.println(ball);
		return ball;
	}
	
	public int getStrike() {
		return strike;
	}
	
	public int getBall() {
		return ball;
	}
}
