package kosa.thread;

public class Account {
	private String accountNo; // ���¹�ȣ ����
	private String ownerName; // ������
	private int balance; 	  // �ܾ�
	
	public Account() {
		
	}
	
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	// �Ա��ϴ�
	public void deposit(int amount) {
		balance += amount;
	}
	
	// ����ϴ�
	// withdraw �޼��带 ȣ���ϴ� ������ ���ܸ� try catch�� ó���ؾߵȴ�.
	public int withdraw(int amount) throws Exception {
		if(balance <amount) {
			throw new Exception("�ܾ׺���");
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
