package kosa.thread;

public class Account {
	private String accountNo; // 계좌번호 역할
	private String ownerName; // 계좌주
	private int balance; 	  // 잔액
	
	public Account() {
		
	}
	
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	// 입금하다
	public void deposit(int amount) {
		balance += amount;
	}
	
	// 출금하다
	// withdraw 메서드를 호출하는 곳에서 예외를 try catch로 처리해야된다.
	public int withdraw(int amount) throws Exception {
		if(balance <amount) {
			throw new Exception("잔액부족");
		} else {
			balance -= amount;
		}
		return amount;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", ownerName=" + ownerName + ", balance=" + balance + "]";
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	
	
}
