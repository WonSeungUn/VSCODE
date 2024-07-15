package kosa.bank;

import java.util.Arrays;

public class MyBank {
	private Customer customers[];
	private int customersNum;
	
	public MyBank() {
		customers = new Customer[10];
	}
	
	public void addCustomer(String id, String name, long balance) {
		customers[customersNum++] = new Customer(id, name, balance);
	}
	

	public Customer getCustomer(String id) {
		Customer cust = new Customer();
		for(int i = 0 ; i<customersNum ; i++) {
			if(customers[i].getId().equals(id)) {
				cust = customers[i];
				break;
			}
		}
		return cust;
	}

	public Customer[] getAllCustomers() {
		Customer[] cust = new Customer[customersNum];
		for(int i =0; i<customersNum ; i++) {
			cust[i] = customers[i];
		}
		
		// 둘 다 위의 for문과 같다.
		System.arraycopy(customers, 0, cust, 0, customersNum);
		cust = Arrays.copyOf(customers, customersNum);
		return cust;
	}
	
	
	public int getCustomersNum() {
		return customersNum;
	}

	
}
