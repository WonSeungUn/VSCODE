package kosa.mission;

public class MainBook {

	public static void main(String[] args) {
		int total=0;
		
		// �ߺ��Ǵ� ����� ������ �����ڵ��� �迭 �ȿ� ���� �� �ִ�.
		// ��ü ���� �迭 �ȿ� �� �� �ִ�.
		Book arr[] = {
				new Book("JAVA", 30000),
				new Book("JSP", 20000),
				new Book("Oracle", 15000)
		};
		
		// ���� for���� ���ؼ� ������ å�� ���� ���ݰ� å������ ���ؼ� �׸��� �ѱݾ��� ����� �� �ִ�.
		for(Book b :arr) {
			b.discount();
			b.print();
			total +=b.dc_price;
		}
		
		System.out.println("�ѱݾ� : " + total);
	}

}
