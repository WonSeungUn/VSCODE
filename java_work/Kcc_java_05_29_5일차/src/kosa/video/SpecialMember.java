package kosa.video;

public class SpecialMember extends GeneralMember {
	private int point;

	public SpecialMember() {
		
	}
	
	public SpecialMember(String id, String name, String address, int point) {
		super(id, name, address);
		this.point = point;
	}

	@Override
	public void rental(Video videos) {
		super.rental(videos);
		this.point += 100;
}

	@Override
	public void show() {
		super.show();
		System.out.println("���ʽ� ����Ʈ :" + point);
	}
	
	public void specialPrint() {
		System.out.println("����� ���");
	}
	
	
	
	
}
