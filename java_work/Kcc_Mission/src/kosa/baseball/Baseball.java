package kosa.baseball;

import java.util.Arrays;

// 3개의 난수를 생성하고 3개의 숫자를 입력받아 같은 자릿수에 같은 숫자가 있다면 strike 다른 자릿수에 같은 숫자가 있다면 ball로 처리하는 프로그램 만들기
// 3자릿수이므로 배열로 하는 것 같음!
// ex) 난수 : 1 2 3 / 입력 : 2 2 3 => strike : 2 / ball : 1
// 스트라이크가 3번될 때까지 반복하고 스트라이크가 3번 성공된 시점에서 프로그램 종료
public class Baseball {
	// 난수를 생성 (중복되지 않아야한다.)
	private int random[];
	
	public Baseball() {
		// 3개의 난수 생성 ( 중복 X )
		// 3개의 숫자 배열을 만든다
		random = new int[3];
		
		// 첫번째 숫자의 난수
		random[0] = (int)(Math.random()*9)+1; // 1~9 까지의 난수
		
		// 첫번째 난수랑 겹치면 다시 생성하고 첫번째 난수랑 겹치지 않을 때까지 반복하는 do while문 작성
		// do 안에는 2번째 난수를 생성하는 것을 만들어주고
		// while 의 조건은 성립되지 않아야 하는 조건문을 써준다.
		// 지금은 성립되지 않아야 하는 조건은 random의 첫번째 난수와 random의 두번째 난수가 같아야 하는 조건이다.
		// 그러므로 while 안의 조건문은 random의 첫번째 난수와 두번째 난수가 같아야한다는 조건문을 써야하므로 random[0] == random[1] 이 된다
		do {
			random[1] = (int)(Math.random()*9)+1; // 1~9 까지의 난수
		} while (random[0] == random[1]);
		
		// 3번째 난수는 첫번째 난수와 같아도 안되고 2번째 난수와 같아도 안된다.
		do {
			random[2] = (int)(Math.random()*9)+1; // 1~9 까지의 난수
		} while (random[1] == random[2] || random[0] == random[2]);
		
		// do while문이 제대로 실행되는지 확인하기 위한 정답.
		// random만 출력할 경우 주소값만 출력이 되므로 random 배열안에 어떤 데이터가 들어 있는지 알 수 없으므로 Arrays.toString을 써준다
		// Arrays.toString의 경우 배열로 나열해줄 뿐만 아니라 각 데이터마다 쉼표를 넣어줌으로써 데이터를 각각 알아보기 쉽다.
		System.out.println("정답 : " + Arrays.toString(random)); ;
	}
	
	// 스트라이크 체크
	// 123
	// 142
	// 몇번 스트라이크가 됐는지 알기 위해 리턴값을 int로 받았다.
	public int countStrike(int input[]) {
		int strike = 0;
		for(int i = 0 ; i<3 ; i++) {
			if(random[i] == input[i]) {
				strike++;
			}
		}
		return strike;
	}
	
	// 볼 체크
	public int countBall(int input[]) {
		int ball = 0 ;
		for(int i= 0 ; i <3 ; i++) {
			if(random[i] == input[(i+1)%3]) ball++;
			if(random[i] == input[(i+2)%3]) ball++;
		}
		return ball;
	}
}
	