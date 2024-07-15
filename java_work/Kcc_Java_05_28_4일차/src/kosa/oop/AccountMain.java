package kosa.oop;

import java.util.Arrays;

public class AccountMain {
	
	public static void main(String[] args) {
//		Account account; // 주소값을 가지고 있는 참조형(클래스 타입)
		
		// 객체가 생성된다는 것은 그 객체의 내용만큼 메모리가 할당된다는 말이다.
		// 생성자 호출 시기 : 해당하는 객체가 생성될 때 (new 연산자가 실행될 때)
		// 메소드는 . 을 통해서 직접 호출 하지만 객체가 new 하는 순간 생성자는 자동으로 호출된다.
		// new : 새로운 객체의 메모리 할당 / 파라미터에 맞는 생성자를 자동으로 호출해줌
		// 참조형 변수 전달
		// 참조형 변수는 주소값을 가지고 있는 참조형(클래스 타입)과 같은 데이터를 가지고 있어야한다.
		
//		account = new Account(); // 객체 생성(메모리 할당)
		
		// 외부라이브러리의 경우 자신이 원한다고 해서 생성자를 만든다고 해서 되는게 아니다.
//		StringBuffer sb = new StringBuffer();
		
//		account.accountNo = "111-111";
//		account.ownerName = "홍길동";
//		account.balance = 10000;
		
//		account.deposit(5000);
//		try {
//			account.withdraw(13000);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
//		System.out.println("계좌번호 : " + account.accountNo);
//		System.out.println("계좌주 : " + account.ownerName);
//		System.out.println("잔액 : " + account.balance);
		
		MinusAccount ma = new MinusAccount("1111-1111", "ownerName", 20000, 20000);
		try {
			ma.withdraw(30000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(ma.getBalance());
	}
}
