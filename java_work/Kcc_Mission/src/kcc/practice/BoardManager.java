package kcc.practice;

import java.util.Scanner;

public class BoardManager {
	// 게시판에 필요한것... 목록으로 하니까 배열 필요할 것 같고 인덱스 접근해야하므로 
	// 하나의 정수 변수 키보드 입력 받아야하니까 scanner
	private Board[] b;
	private Scanner sc;
	private int count;
	
	public BoardManager() {
		b = new Board[10];
		sc = new Scanner(System.in);
	}
	
	// 게시판 추가
	public void addBoard() {
		System.out.print("글번호  : ");
		int boardNo = Integer.parseInt(sc.nextLine());
		System.out.print("제목 : ");
		String title = sc.nextLine();
		System.out.print("내용  : ");
		String content = sc.nextLine();
		System.out.print("글쓴이  : ");
		String writer = sc.nextLine();
		
		b[count++] = new Board(boardNo, title, content, writer);
		System.out.println("게시글 등록이 완료되었습니다.");
		System.out.println();
	}
	
	// 게시판 글 출력
	public void printBoard() {
		System.out.print("찾으시려는 글번호를 입력해주세요.");
		int boardNo = Integer.parseInt(sc.nextLine());
		if(b == null) {
			System.out.println("존재하는 게시판이 없습니다.");
		}
		for(int i = 0; i<count ; i++) {
			if(b[i].getBoardNo() == boardNo) {
				b[i].print();
			} else {
				System.out.println("해당 글번호는 존재하지 않습니다.");
			}
		}
		System.out.println();
	}
	
	// 게시판 목록 출력
	public void listBoard() {
		for(int i = 0 ; i < count ; i++) {
			b[i].print();
		}
		System.out.println();
	}
	
	// 게시판 수정
	public void update() {
		System.out.println("수정하려고 하시는 글의 글번호를 입력해주세요");
		String boardNo = sc.nextLine();
		for(int i = 0 ; i<count ; i++) {
			if(b[i].getBoardNo() == Integer.parseInt(boardNo)) {
				System.out.println("수정하실 내용을 입력해주세요");
				b[i].setContent(sc.nextLine());
				System.out.println("수정하실 제목을 입력해주세요");
				b[i].setTitle(sc.nextLine());
				System.out.println("수정이 완료되었습니다.");
				System.out.println();
			}
		}
	}
	
	
	public void delete() {
		System.out.println("삭제하려고 하시는 글의 글번호를 입력해주세요");
		String boardNo = sc.nextLine();
		for(int i = 0 ; i< count ; i++) {
			if(b[0].getBoardNo() == Integer.parseInt(boardNo)) {
				b[0] = b[1];
			} else if(b[i].getBoardNo() == Integer.parseInt(boardNo)) {
				b[i] = b[i-1];
			}
		}
	}
	
}
