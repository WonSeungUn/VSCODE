package kosa.mission;

public class Book {
	// 상태 : 책이름, 정가, 할인된 가격
	// 기능 : 할인된 가격 산출, 책정보 출력
	String book;
	int price;
	int dc_price;
	
	public Book() {
		
	}
	
	public Book(String book, int price) {
		this.book = book;
		this.price = price;
	}
	
	public void discount() {
		if(price >=30000) {
			dc_price = (int)(price * 0.75);
		} else if(price >=20000) {
			dc_price = (int)(price * 0.80);
		} else if(price>=15000) {
			dc_price = (int)(price * 0.85);
		}
	}
	
	public void print() {
		System.out.println(book + "교재는 정가는" + price+"원 할인된 가격은"+dc_price + "원 입니다");
	}
	
	
}
