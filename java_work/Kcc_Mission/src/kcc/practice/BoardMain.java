package kcc.practice;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BoardManager bm = new BoardManager();
		while (true) {
			System.out.println("1. ���߰� 2. �� ��� 3. �� ��� 4. �� ���� 5. �� ���� 6. ���α׷� ����");
			System.out.print("�޴� �Է� : ");
			String menu = sc.nextLine();
			switch (menu) {
			case "1":
				bm.addBoard();
				break;
			case "2":
				bm.printBoard();
				break;
			case "3":
				bm.listBoard();
				break;
			case "4":
				bm.update();
				break;
			case "5":
				bm.delete();
				break;
			case "6":
				return;
			}

		}
	}
}
