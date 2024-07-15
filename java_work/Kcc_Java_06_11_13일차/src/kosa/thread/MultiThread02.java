package kosa.thread;

public class MultiThread02 {
	public static void main(String[] args) {
		SharedArea area = new SharedArea();
		area.account1 = new Account("1111-1111", "�̸���", 20000000);
		area.account2 = new Account("2222-2222", "������", 10000000);
		
		AccountThread thread1 = new AccountThread(area);
		PrintThread thread2 = new PrintThread(area);
		
		thread1.start();
		thread2.start();
		
	}
}
