package kosa.video.professor;

public class Main {
	public static void main(String[] args) {
		Video v1= new Video("1", "Æ®·£½ºÆ÷¸Ó3", "¼­ºÀ¼ö");
		Video v2= new Video("2", "ÄôÇªÆÒ´õ4", "Áö¼º¹Î");
		
		GeneralMember gm = new GeneralMember("aaa", "È«±æµ¿", "¼­¿ï");
		
		gm.rental(v1);
		gm.rental(v2);
		gm.show();
	}
}
