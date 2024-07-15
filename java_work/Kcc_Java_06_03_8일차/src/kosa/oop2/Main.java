package kosa.oop2;

public class Main {

	public static void main(String[] args) {
		
		MySQLDao md = new MySQLDao();
		
		Dao dao = new Dao() {

			@Override
			public void insert() {
				System.out.println("NoSQL");
			}
		
			
		};
		
		MyService ms = new MyService(dao);
		ms.insertService();
	}

}
