package kosa.oop2;

public class MyService {
	private OracleDao od; //OracleDao 와 MyService 는 연관관계이다.
	private MySQLDao md;
	private Dao dao;
	
	
	public MyService() {
		
	}
	
	public MyService(Dao dao) {
		this.dao = dao;
	}

	public MyService(OracleDao od) {
		super();
		this.od = od;
		
	}
	public MyService(MySQLDao md) {
		super();
		this.md = md;
	}
	
	public void insertService() {
		dao.insert();
	}
	

	public MySQLDao getMd() {
		return md;
	}


	public void setMd(MySQLDao md) {
		this.md = md;
	}



	public OracleDao getDao() {
		return od;
	}


	public void setDao(OracleDao dao) {
		this.od = dao;
	}


	
	
}
