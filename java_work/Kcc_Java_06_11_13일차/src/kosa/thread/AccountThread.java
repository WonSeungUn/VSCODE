package kosa.thread;

public class AccountThread extends Thread {
	SharedArea sharedArea;

	public AccountThread() {

	}

	public AccountThread(SharedArea sharedArea) {
		this.sharedArea = sharedArea;
	}

	// critical section : 사용중인 쓰레드에서 다른 쓰레드가 방해하는 것
	// critial section을 방지하기 위해 동기화를 하자!!
	public void run() {
		for (int cnt = 0; cnt < 12; cnt++) {
			synchronized (sharedArea) {
				try {
					sharedArea.account1.withdraw(1000000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("이몽룡 계좌 : 100만원 인출");
				sharedArea.account2.deposit(1000000);
				System.out.println("성춘향 계좌 : 100만원 입금");
			}
		}
	}

}
