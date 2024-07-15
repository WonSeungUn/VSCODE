package kosa.phone;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Manager m = new Manager();
		
		while(true) {
			System.out.println("1. 추가 2. 전체출력 3. 종료");
			System.out.print("메뉴 입력 :");
			String menu = sc.nextLine();
			
			switch (menu) {
			case "1":
				m.addPhoneInfo();
				break;
			case "2":
				m.listPhoneInfo();
				break;
			case "3":
				System.out.println("프로그램 종료");
				return;
			}
		}
	}
}
