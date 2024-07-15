package kosa.oop;

import java.util.Arrays;

public class AccountMain2 {
	public static void main(String[] args) {
//		CheckingAccount ca2 = new CheckingAccount("111-111", "���¾�", 10000, "222-222");
//		
//		try {
//			ca.pay("222-222", 3000);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println(ca.getBalance());
		
		
//		Account ca = new CheckingAccount("111-111","���¾�",10000,"222-222");
//		
//		// �ڽ����� ���� ����ȯ
//		CheckingAccount ca2 =(CheckingAccount)ca;
		
		// ClassCastingException ���� �߻�
		// ó������ CheckingAccount ���� ū Account�� ����ȯ�Ϸ��� �߱� ������ �ڽ�Ŭ������ ĳ������ �ȵȴ�.
//		Account ca = new Account("111", "ownerName", 10000);
//		CheckingAccount ca = (CheckingAccount)ca2;
//		
//		try {
//			// �����ε� �������̵��� �޼ҵ�� �θ� Ŭ������ �ڽ� Ŭ������ ����� �� ������ 
//			// �ٺ������� �θ� Ŭ������ �ڽ� Ŭ������ �޼ҵ带 ����� �� ����.
//			// ��ü ����ȯ�� �������� �����ϴ°��� instanceof �̴�.
//			if(ca instanceof CheckingAccount) {
//			((CheckingAccount)ca2).pay("222-222", 3000);
//		}	else {
//				System.out.println("����ȯ �Ұ��մϴ�.");
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println(ca2.getBalance());
		
		// ======================================================================================================================
		
		// ����
		// �θ�� ����ȯ 
//		Account ca = new CheckingAccount("111-1111", "ownerName", 100000, "111=22312");
//		
//		CheckingAccount obj = (CheckingAccount)ca; // ���� ����ȯ
//		
//		try {
////			ca.pay("222-222",1000); // �θ�� ����ȯ �� �ڽŸ��� ������ �ִ� �޼ҵ�� �� �̻� ���� �Ұ�
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
