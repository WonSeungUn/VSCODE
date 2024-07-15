package kosa.mission;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListMission {
	public static void main(String[] args) {
		// List 자료구조를 활용하여 키보드로부터 문자열을 입력받아 처리하자.
		// 1. 데이터 추가 2. 데이터 삭제 3. 데이터 출력 4. 종료
		
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new LinkedList<String>();
		
		int index = -1;
		while(true) {
			System.out.println("1. 데이터 추가 2. 데이터 삭제 3. 데이터 출력 4. 종료");
			System.out.print("메뉴 : ");
			String str = sc.nextLine();
			switch (str) {
			case "1":
				System.out.println("추가할 데이터를 입력해주세요");
				list.add(sc.nextLine());
				break;
			case "2":
				System.out.println("삭제할 데이터의 문자열을 입력해주세요");
				index = list.indexOf(sc.nextLine());
				if(index != -1) {
					list.remove(index);
				} else {
					System.out.println("해당 문자열은 존재하지 않습니다.");
				}
				
//				String remove = sc.nextLine();
//				for(int i = 0 ; i <list.size() ; i++) {
//					if(list.get(i).equals(remove)) {
//						list.remove(i);
//					}
//				}
				System.out.println("해당 데이터가 삭제되었습니다.");
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
				System.out.println("프로그램을 종료합니다.");
				return;			
			}
		}
	}
}
