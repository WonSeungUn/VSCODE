package kcc_cafe;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private int orderNo;
	private int total; // 총가격
	private int salePrice; // 할인 가격
	private int orderPrice; // 결제 가격
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
		System.out.println("주문번호 :" + orderNo + "\t" +"손님이름 : " + customer.getName());
		for(Coffee c : coffees) {
			c.getInfo();
		}
		System.out.println("-------------------------------------------------------");
		System.out.println("총가격 : " + total +" 원");
		System.out.println("할인 적용 가격 :" + salePrice +" 원");
		System.out.println("결제 가격 :" +orderPrice + " 원");
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
