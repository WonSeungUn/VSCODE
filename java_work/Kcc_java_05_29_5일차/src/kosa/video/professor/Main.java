package kosa.video.professor;

public class Main {
	public static void main(String[] args) {
		Video v1= new Video("1", "Ʈ��������3", "������");
		Video v2= new Video("2", "��Ǫ�Ҵ�4", "������");
		
		GeneralMember gm = new GeneralMember("aaa", "ȫ�浿", "����");
		
		gm.rental(v1);
		gm.rental(v2);
		gm.show();
	}
}
