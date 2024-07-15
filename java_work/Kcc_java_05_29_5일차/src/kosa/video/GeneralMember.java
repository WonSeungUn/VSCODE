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
		System.out.println("회원의 아이디: " + this.id);
		System.out.println("회원의 이름: " + this.name);
		System.out.println("회원의 주소: " + this.address);
		System.out.println("회원이 대여한 비디오 번호 : " +videos.getVideoNo());
		System.out.println("회원이 대여한 비디오 제목 : " +videos.getVideoTitle());
		System.out.println("회원이 대여한 비디오 주인공 : " +videos.getActor());		
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
