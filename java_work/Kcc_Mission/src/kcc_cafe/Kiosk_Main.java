package kcc_cafe;

import java.util.Scanner;

public class Kiosk_Main {
	private static Coffee[] coffees = new Coffee[2];
	private static int orderNo = 0;
	
	public static void main(String[] args) {
		
		preprocess();
		
		// �մ� ����
		Customer c = new Customer("���¾�");
		
		// �ֹ� ����
		System.out.println("Ŀ�Ǹ� �������ּ���");
		Order o = new Order(orderNo++, c, "24-05-30");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Ŀ�Ǹ� �������ּ��� > 1. �Ƹ޸�ī�� 2. ī��� �����ƶ� 3. ����");
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
		
	// Ŀ�� ����
	coffees[0] = new Coffee("�Ƹ޸�ī��", new Bean("�ɳ�",500),2000);
	coffees[1] = new Coffee("ī��� �����ƶ�", new Bean("��Ƽ���Ǿ�",600),2400);
	}
}
