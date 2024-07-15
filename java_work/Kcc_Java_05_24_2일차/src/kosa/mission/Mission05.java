package kosa.mission;

import java.util.Scanner;

public class Mission05 {

	public static void main(String[] args) {
		// �޴��� �����ؼ� �ش� �޴��� ��ɹ��� �����غ���.
		// 1. �߰� 2. ��� 3. �˻� 4. ����
//		Scanner sc = new Scanner(System.in);
//		ArrayList<String> choices = new ArrayList<>();
//		while (true) {
//			System.out.println("1. �߰� 2. ��� 3. �˻� 4. ����");
//			System.out.print("�޴� :");
//			String menu = sc.nextLine();
//			
//			switch (menu) {
//			case "1":
//				System.out.println("�߰� ����");
//				String choice = sc.nextLine();
//				choices.add(choice);
//				break;
//			case "2":
//				System.out.println("��� ����");
//				for(String n : choices) {
//					System.out.print(n + ",");
//				}
//				break;
//			case "3":
//				System.out.println("�˻� ����");
//				System.out.println("1. �������� 2. ��� 3. �����");
//				System.out.println();
//				break;
//			case "4":
//				System.out.println("���α׷� ���� ����");
//				return;
//			}
//		}

		
		Scanner sc = new Scanner(System.in);

		while(true) {
		System.out.println("1. �߰� 2. ��� 3. �˻� 4. ����");
		System.out.print("�޴� ���� : ");
		String menu = sc.nextLine();
		    switch(menu) {
		        case "1":
		        System.out.println("�߰� ����");
		        break;
		        case "2": 
		        System.out.println("��� ����"); 
		        break;
		        case "3": 
		        System.out.println("�˻� ����"); 
		        break;
		        case "4": 
		        System.out.println("���� ����"); 
		        return;
		    }
		}
	}

}
