package kosa.oop;

import java.util.Arrays;

public class AccountMain {
	
	public static void main(String[] args) {
//		Account account; // �ּҰ��� ������ �ִ� ������(Ŭ���� Ÿ��)
		
		// ��ü�� �����ȴٴ� ���� �� ��ü�� ���븸ŭ �޸𸮰� �Ҵ�ȴٴ� ���̴�.
		// ������ ȣ�� �ñ� : �ش��ϴ� ��ü�� ������ �� (new �����ڰ� ����� ��)
		// �޼ҵ�� . �� ���ؼ� ���� ȣ�� ������ ��ü�� new �ϴ� ���� �����ڴ� �ڵ����� ȣ��ȴ�.
		// new : ���ο� ��ü�� �޸� �Ҵ� / �Ķ���Ϳ� �´� �����ڸ� �ڵ����� ȣ������
		// ������ ���� ����
		// ������ ������ �ּҰ��� ������ �ִ� ������(Ŭ���� Ÿ��)�� ���� �����͸� ������ �־���Ѵ�.
		
//		account = new Account(); // ��ü ����(�޸� �Ҵ�)
		
		// �ܺζ��̺귯���� ��� �ڽ��� ���Ѵٰ� �ؼ� �����ڸ� ����ٰ� �ؼ� �Ǵ°� �ƴϴ�.
//		StringBuffer sb = new StringBuffer();
		
//		account.accountNo = "111-111";
//		account.ownerName = "ȫ�浿";
//		account.balance = 10000;
		
//		account.deposit(5000);
//		try {
//			account.withdraw(13000);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
//		System.out.println("���¹�ȣ : " + account.accountNo);
//		System.out.println("������ : " + account.ownerName);
//		System.out.println("�ܾ� : " + account.balance);
		
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
