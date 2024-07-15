package kosa.mission;

import java.util.Scanner;

public class QueueMission {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		QueueFood food = new QueueFood();
		while (true) {
			System.out.println("1. 주문 요청 2. 주문요청목록 3. 주문처리 4. 매출액 총액 5. 종료");
			String menu = sc.nextLine();

			switch (menu) {
			case "1":
				food.addFood();
				break;
			case "2":
				food.listFood();
				break;
			case "3":
				food.finishOrder();
				break;
			case "4":
				food.totalprint(food);
				break;
			case "5":
				System.out.println("주문이 종료되었습니다.");
				return;

			}
		}
	}
}
