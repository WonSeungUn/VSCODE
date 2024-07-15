package kcc.practice;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BoardManager bm = new BoardManager();
		while (true) {
			System.out.println("1. 글추가 2. 글 출력 3. 글 목록 4. 글 수정 5. 글 삭제 6. 프로그램 종료");
			System.out.print("메뉴 입력 : ");
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
