package kcc.practice;

import java.util.Scanner;

public class BoardManager {
	// �Խ��ǿ� �ʿ��Ѱ�... ������� �ϴϱ� �迭 �ʿ��� �� ���� �ε��� �����ؾ��ϹǷ� 
	// �ϳ��� ���� ���� Ű���� �Է� �޾ƾ��ϴϱ� scanner
	private Board[] b;
	private Scanner sc;
	private int count;
	
	public BoardManager() {
		b = new Board[10];
		sc = new Scanner(System.in);
	}
	
	// �Խ��� �߰�
	public void addBoard() {
		System.out.print("�۹�ȣ  : ");
		int boardNo = Integer.parseInt(sc.nextLine());
		System.out.print("���� : ");
		String title = sc.nextLine();
		System.out.print("����  : ");
		String content = sc.nextLine();
		System.out.print("�۾���  : ");
		String writer = sc.nextLine();
		
		b[count++] = new Board(boardNo, title, content, writer);
		System.out.println("�Խñ� ����� �Ϸ�Ǿ����ϴ�.");
		System.out.println();
	}
	
	// �Խ��� �� ���
	public void printBoard() {
		System.out.print("ã���÷��� �۹�ȣ�� �Է����ּ���.");
		int boardNo = Integer.parseInt(sc.nextLine());
		if(b == null) {
			System.out.println("�����ϴ� �Խ����� �����ϴ�.");
		}
		for(int i = 0; i<count ; i++) {
			if(b[i].getBoardNo() == boardNo) {
				b[i].print();
			} else {
				System.out.println("�ش� �۹�ȣ�� �������� �ʽ��ϴ�.");
			}
		}
		System.out.println();
	}
	
	// �Խ��� ��� ���
	public void listBoard() {
		for(int i = 0 ; i < count ; i++) {
			b[i].print();
		}
		System.out.println();
	}
	
	// �Խ��� ����
	public void update() {
		System.out.println("�����Ϸ��� �Ͻô� ���� �۹�ȣ�� �Է����ּ���");
		String boardNo = sc.nextLine();
		for(int i = 0 ; i<count ; i++) {
			if(b[i].getBoardNo() == Integer.parseInt(boardNo)) {
				System.out.println("�����Ͻ� ������ �Է����ּ���");
				b[i].setContent(sc.nextLine());
				System.out.println("�����Ͻ� ������ �Է����ּ���");
				b[i].setTitle(sc.nextLine());
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
				System.out.println();
			}
		}
	}
	
	
	public void delete() {
		System.out.println("�����Ϸ��� �Ͻô� ���� �۹�ȣ�� �Է����ּ���");
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
