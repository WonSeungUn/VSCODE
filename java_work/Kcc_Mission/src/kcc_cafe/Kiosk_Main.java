package kcc_cafe;

import java.util.Scanner;

public class Kiosk_Main {
	private static Coffee[] coffees = new Coffee[2];
	private static int orderNo = 0;
	
	public static void main(String[] args) {
		
		preprocess();
		
		// 손님 생성
		Customer c = new Customer("원승언");
		
		// 주문 생성
		System.out.println("커피를 선택해주세요");
		Order o = new Order(orderNo++, c, "24-05-30");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("커피를 선택해주세요 > 1. 아메리카노 2. 카라멜 마끼아또 3. 종료");
			String menu = sc.nextLine();
			switch (menu) {
			case "1":
				o.addCoffee(coffees[0]);
				break;
			case "2":
				o.addCoffee(coffees[1]);
				break;
			case "3":
				o.printOrder();
				return;
			}
		}
	}
	public static void preprocess() {
		
	// 커피 생성
	coffees[0] = new Coffee("아메리카노", new Bean("케냐",500),2000);
	coffees[1] = new Coffee("카라멜 마끼아또", new Bean("에티오피아",600),2400);
	}
}
