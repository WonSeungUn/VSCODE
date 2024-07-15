package kosa.baseball;

import java.util.Arrays;

//3개의 난수를 생성하고 3개의 숫자를 입력받아 같은 자릿수에 같은 숫자가 있다면 strike 다른 자릿수에 같은 숫자가 있다면 ball로 처리하는 프로그램 만들기
//3자릿수이므로 배열로 하는 것 같음!
//ex) 난수 : 1 2 3 / 입력 : 2 2 3 => strike : 2 / ball : 1
//스트라이크가 3번될 때까지 반복하고 스트라이크가 3번 성공된 시점에서 프로그램 종료
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
