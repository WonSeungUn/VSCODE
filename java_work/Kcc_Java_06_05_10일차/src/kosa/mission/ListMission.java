package kosa.mission;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListMission {
	public static void main(String[] args) {
		// List �ڷᱸ���� Ȱ���Ͽ� Ű����κ��� ���ڿ��� �Է¹޾� ó������.
		// 1. ������ �߰� 2. ������ ���� 3. ������ ��� 4. ����
		
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new LinkedList<String>();
		
		int index = -1;
		while(true) {
			System.out.println("1. ������ �߰� 2. ������ ���� 3. ������ ��� 4. ����");
			System.out.print("�޴� : ");
			String str = sc.nextLine();
			switch (str) {
			case "1":
				System.out.println("�߰��� �����͸� �Է����ּ���");
				list.add(sc.nextLine());
				break;
			case "2":
				System.out.println("������ �������� ���ڿ��� �Է����ּ���");
				index = list.indexOf(sc.nextLine());
				if(index != -1) {
					list.remove(index);
				} else {
					System.out.println("�ش� ���ڿ��� �������� �ʽ��ϴ�.");
				}
				
//				String remove = sc.nextLine();
//				for(int i = 0 ; i <list.size() ; i++) {
//					if(list.get(i).equals(remove)) {
//						list.remove(i);
//					}
//				}
				System.out.println("�ش� �����Ͱ� �����Ǿ����ϴ�.");
				break;
			case "3":
//				for(int i = 0 ; i <list.size() ; i++) {
//					System.out.println(list.get(i));
//				}
				
				
				Iterator<String> iter = list.iterator();
				while(iter.hasNext()) {
					System.out.println(iter.next());
				}
				
				System.out.println();
				break;
			case "4":
				System.out.println("���α׷��� �����մϴ�.");
				return;			
			}
		}
	}
}
