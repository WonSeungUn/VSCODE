package kosa.mission;

public class Book {
	// ���� : å�̸�, ����, ���ε� ����
	// ��� : ���ε� ���� ����, å���� ���
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
		System.out.println(book + "����� ������" + price+"�� ���ε� ������"+dc_price + "�� �Դϴ�");
	}
	
	
}
