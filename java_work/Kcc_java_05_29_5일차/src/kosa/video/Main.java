package kosa.video;

public class Main {
	public static void main(String[] args) {
//		Video v1 = new Video(1,"트랜스포머3","서봉수");
//		Video v2 = new Video(2,"쿵푸팬더2","지성민");

		Video[] v = { new Video(1, "트랜스포머3", "서봉수"), new Video(2, "쿵푸팬더2", "지성민") };
//		GeneralMember m1 = new GeneralMember("aaa", "홍길동", "동탄");
//		GeneralMember m2 = new GeneralMember("bbb", "김철수", "서울");
//		
//		SpecialMember sm1 = new SpecialMember("ccc", "원승언","서울", 20);
//		m1.borrow(v1);
//		m2.borrow(v2);
//		m1.printMember(v1);
//		System.out.println();
//		m2.printMember(v2);
//		sm1.rental(v1);
//		sm1.show();

		// 미션
		// GeneralMember 와 SpecialMember를 함께 배열에 넣고
		// 각각의 rental(), show() 호출 출력
		// 특히 SpecialMember는 SpecialPrint() 호출되도록 하여라.

		GeneralMember m[] = { new GeneralMember("id", "name", "address"),
				new SpecialMember("id", "name", "address", 100) };

		for (int i = 0; i < m.length; i++) {
			if (m[i] instanceof SpecialMember) {
				System.out.println("===================================");
				((SpecialMember) m[i]).specialPrint();
				m[i].rental(v[i]);
				m[i].show();
				System.out.println("===================================");
			} else {
				m[i].rental(v[i]);
				m[i].show();
			}

		}

	}
}
