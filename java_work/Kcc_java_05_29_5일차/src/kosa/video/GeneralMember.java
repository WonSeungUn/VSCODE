package kosa.video;

public class GeneralMember {
	private String id;
	private String name;
	private String address;
	private Video videos;
	
	public GeneralMember() {
		
	}

	public GeneralMember(String id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public void rental(Video videos) {
		this.videos = videos;
	}
	
	public void show() {
		System.out.println("ȸ���� ���̵�: " + this.id);
		System.out.println("ȸ���� �̸�: " + this.name);
		System.out.println("ȸ���� �ּ�: " + this.address);
		System.out.println("ȸ���� �뿩�� ���� ��ȣ : " +videos.getVideoNo());
		System.out.println("ȸ���� �뿩�� ���� ���� : " +videos.getVideoTitle());
		System.out.println("ȸ���� �뿩�� ���� ���ΰ� : " +videos.getActor());		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	
}
