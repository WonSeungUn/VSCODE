package kcc.practice;

public class Main {
	public static void main(String[] args) {
		Manager m = new Manager();
		while(true) {
			System.out.println("1. �߰� 2. ��ü��� 3. �˻�  4. ���� 5. ���� 6. ���� 7. ������ ���� 8. ������ �ҷ����� 9. ����");
			String menu = DataInput.sc.nextLine();
			switch (menu) {
			case "1":
				System.out.println("�޴� : " + menu);
				m.addPhoneInfo();
				break;
			case "2":
				System.out.println("�޴� : " + menu);
				m.listPhoneInfo();
				break;
			case "3":
				System.out.println("�޴� : " + menu);
				m.searchPhoneInfo();
				break;
			case "4":
				System.out.println("�޴� : " + menu);
				m.updatePhoneInfo();
				break;
			case "5":
				System.out.println("�޴� : " + menu);
				m.deletePhoneInfo();
				break;
			case "6":
				System.out.println("�޴� : " + menu);
				m.phoneSort();
				break;
			case "7":
				System.out.println("�޴� : " + menu);
				m.phoneDataSave();
				break;
			case "8":
				System.out.println("�޴� : " + menu);
				m.phoneDataLoad();
				break;
			case "9":
				System.out.println("�޴� : " + menu);
				System.out.println("���α׷� ����");
				return;
			}
		}
		
	}
}
