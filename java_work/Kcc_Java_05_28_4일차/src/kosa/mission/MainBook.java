package kosa.mission;

public class MainBook {

	public static void main(String[] args) {
		int total=0;
		
		// 중복되는 비슷한 유형의 생성자들은 배열 안에 넣을 수 있다.
		// 객체 또한 배열 안에 들어갈 수 있다.
		Book arr[] = {
				new Book("JAVA", 30000),
				new Book("JSP", 20000),
				new Book("Oracle", 15000)
		};
		
		// 향상된 for문을 통해서 각각의 책의 할인 가격과 책정보에 대해서 그리고 총금액을 출력할 수 있다.
		for(Book b :arr) {
			b.discount();
			b.print();
			total +=b.dc_price;
		}
		
		System.out.println("총금액 : " + total);
	}

}
