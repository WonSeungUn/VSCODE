package kosa.oop;

import java.util.Arrays;

public class AccountMain2 {
	public static void main(String[] args) {
//		CheckingAccount ca2 = new CheckingAccount("111-111", "원승언", 10000, "222-222");
//		
//		try {
//			ca.pay("222-222", 3000);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println(ca.getBalance());
		
		
//		Account ca = new CheckingAccount("111-111","원승언",10000,"222-222");
//		
//		// 자식으로 강제 형변환
//		CheckingAccount ca2 =(CheckingAccount)ca;
		
		// ClassCastingException 예외 발생
		// 처음부터 CheckingAccount 보다 큰 Account를 형변환하려고 했기 때문에 자식클래스로 캐스팅이 안된다.
//		Account ca = new Account("111", "ownerName", 10000);
//		CheckingAccount ca = (CheckingAccount)ca2;
//		
//		try {
//			// 오버로딩 오버라이딩된 메소드는 부모 클래스가 자식 클래스를 사용할 수 있으나 
//			// 근본적으로 부모 클래스는 자식 클래스의 메소드를 사용할 수 없다.
//			// 객체 형변환이 가능한지 구분하는것이 instanceof 이다.
//			if(ca instanceof CheckingAccount) {
//			((CheckingAccount)ca2).pay("222-222", 3000);
//		}	else {
//				System.out.println("형변환 불가합니다.");
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println(ca2.getBalance());
		
		// ======================================================================================================================
		
		// 정리
		// 부모로 형변환 
//		Account ca = new CheckingAccount("111-1111", "ownerName", 100000, "111=22312");
//		
//		CheckingAccount obj = (CheckingAccount)ca; // 강제 형변환
//		
//		try {
////			ca.pay("222-222",1000); // 부모로 형변환 후 자신만이 가지고 있는 메소드는 더 이상 접근 불가
//			obj.pay("222-222", 2000);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		Account arr[] = {new Account("11-11", "ownerName", 20000),
				new CheckingAccount("accountNo", "ownerName", 20000, "cardNo"),
				new MinusAccount("accountNo", "ownerName", 10000, 200000)
		};
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] instanceof CheckingAccount) {
				try {
					((CheckingAccount)arr[i]).pay("cardNo", 10000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println(arr[1].getBalance());
		
	}
}
