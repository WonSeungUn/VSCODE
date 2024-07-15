package kcc_cafe;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private int orderNo;
	private int total; // �Ѱ���
	private int salePrice; // ���� ����
	private int orderPrice; // ���� ����
	private List<Coffee> coffees;
	private Customer customer;
	private String date;
	
	public Order() {
		
	}

	public Order(int orderNo, Customer customer, String date) {
		super();
		this.orderNo = orderNo;
		this.customer = customer;
		this.date = date;
		coffees = new ArrayList<Coffee>();
	}

	public void printOrder() {
		calcuOrder();
		System.out.println("�ֹ���ȣ :" + orderNo + "\t" +"�մ��̸� : " + customer.getName());
		for(Coffee c : coffees) {
			c.getInfo();
		}
		System.out.println("-------------------------------------------------------");
		System.out.println("�Ѱ��� : " + total +" ��");
		System.out.println("���� ���� ���� :" + salePrice +" ��");
		System.out.println("���� ���� :" +orderPrice + " ��");
	}
	
	private void calcuOrder() {
		for(Coffee c : coffees) {
			total += c.getPrice();
		}
		salePrice = customer.setCoupon(total);
		orderPrice = total - salePrice;
	}

	public void addCoffee(Coffee coffee) {
		coffees.add(coffee);
	}
	
	
	
}
