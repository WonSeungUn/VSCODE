package kcc.practice;

public class Main {
	public static void main(String[] args) {
		Manager m = new Manager();
		while(true) {
			System.out.println("1. 추가 2. 전체출력 3. 검색  4. 수정 5. 삭제 6. 정렬 7. 데이터 저장 8. 데이터 불러오기 9. 종료");
			String menu = DataInput.sc.nextLine();
			switch (menu) {
			case "1":
				System.out.println("메뉴 : " + menu);
				m.addPhoneInfo();
				break;
			case "2":
				System.out.println("메뉴 : " + menu);
				m.listPhoneInfo();
				break;
			case "3":
				System.out.println("메뉴 : " + menu);
				m.searchPhoneInfo();
				break;
			case "4":
				System.out.println("메뉴 : " + menu);
				m.updatePhoneInfo();
				break;
			case "5":
				System.out.println("메뉴 : " + menu);
				m.deletePhoneInfo();
				break;
			case "6":
				System.out.println("메뉴 : " + menu);
				m.phoneSort();
				break;
			case "7":
				System.out.println("메뉴 : " + menu);
				m.phoneDataSave();
				break;
			case "8":
				System.out.println("메뉴 : " + menu);
				m.phoneDataLoad();
				break;
			case "9":
				System.out.println("메뉴 : " + menu);
				System.out.println("프로그램 종료");
				return;
			}
		}
		
	}
}
