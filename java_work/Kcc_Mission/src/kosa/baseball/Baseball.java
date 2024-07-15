package kosa.baseball;

import java.util.Arrays;

// 3���� ������ �����ϰ� 3���� ���ڸ� �Է¹޾� ���� �ڸ����� ���� ���ڰ� �ִٸ� strike �ٸ� �ڸ����� ���� ���ڰ� �ִٸ� ball�� ó���ϴ� ���α׷� �����
// 3�ڸ����̹Ƿ� �迭�� �ϴ� �� ����!
// ex) ���� : 1 2 3 / �Է� : 2 2 3 => strike : 2 / ball : 1
// ��Ʈ����ũ�� 3���� ������ �ݺ��ϰ� ��Ʈ����ũ�� 3�� ������ �������� ���α׷� ����
public class Baseball {
	// ������ ���� (�ߺ����� �ʾƾ��Ѵ�.)
	private int random[];
	
	public Baseball() {
		// 3���� ���� ���� ( �ߺ� X )
		// 3���� ���� �迭�� �����
		random = new int[3];
		
		// ù��° ������ ����
		random[0] = (int)(Math.random()*9)+1; // 1~9 ������ ����
		
		// ù��° ������ ��ġ�� �ٽ� �����ϰ� ù��° ������ ��ġ�� ���� ������ �ݺ��ϴ� do while�� �ۼ�
		// do �ȿ��� 2��° ������ �����ϴ� ���� ������ְ�
		// while �� ������ �������� �ʾƾ� �ϴ� ���ǹ��� ���ش�.
		// ������ �������� �ʾƾ� �ϴ� ������ random�� ù��° ������ random�� �ι�° ������ ���ƾ� �ϴ� �����̴�.
		// �׷��Ƿ� while ���� ���ǹ��� random�� ù��° ������ �ι�° ������ ���ƾ��Ѵٴ� ���ǹ��� ����ϹǷ� random[0] == random[1] �� �ȴ�
		do {
			random[1] = (int)(Math.random()*9)+1; // 1~9 ������ ����
		} while (random[0] == random[1]);
		
		// 3��° ������ ù��° ������ ���Ƶ� �ȵǰ� 2��° ������ ���Ƶ� �ȵȴ�.
		do {
			random[2] = (int)(Math.random()*9)+1; // 1~9 ������ ����
		} while (random[1] == random[2] || random[0] == random[2]);
		
		// do while���� ����� ����Ǵ��� Ȯ���ϱ� ���� ����.
		// random�� ����� ��� �ּҰ��� ����� �ǹǷ� random �迭�ȿ� � �����Ͱ� ��� �ִ��� �� �� �����Ƿ� Arrays.toString�� ���ش�
		// Arrays.toString�� ��� �迭�� �������� �Ӹ� �ƴ϶� �� �����͸��� ��ǥ�� �־������ν� �����͸� ���� �˾ƺ��� ����.
		System.out.println("���� : " + Arrays.toString(random)); ;
	}
	
	// ��Ʈ����ũ üũ
	// 123
	// 142
	// ��� ��Ʈ����ũ�� �ƴ��� �˱� ���� ���ϰ��� int�� �޾Ҵ�.
	public int countStrike(int input[]) {
		int strike = 0;
		for(int i = 0 ; i<3 ; i++) {
			if(random[i] == input[i]) {
				strike++;
			}
		}
		return strike;
	}
	
	// �� üũ
	public int countBall(int input[]) {
		int ball = 0 ;
		for(int i= 0 ; i <3 ; i++) {
			if(random[i] == input[(i+1)%3]) ball++;
			if(random[i] == input[(i+2)%3]) ball++;
		}
		return ball;
	}
}
	