package kosa.video;

public class Main {
	public static void main(String[] args) {
//		Video v1 = new Video(1,"Ʈ��������3","������");
//		Video v2 = new Video(2,"��Ǫ�Ҵ�2","������");

		Video[] v = { new Video(1, "Ʈ��������3", "������"), new Video(2, "��Ǫ�Ҵ�2", "������") };
//		GeneralMember m1 = new GeneralMember("aaa", "ȫ�浿", "��ź");
//		GeneralMember m2 = new GeneralMember("bbb", "��ö��", "����");
//		
//		SpecialMember sm1 = new SpecialMember("ccc", "���¾�","����", 20);
//		m1.borrow(v1);
//		m2.borrow(v2);
//		m1.printMember(v1);
//		System.out.println();
//		m2.printMember(v2);
//		sm1.rental(v1);
//		sm1.show();

		// �̼�
		// GeneralMember �� SpecialMember�� �Բ� �迭�� �ְ�
		// ������ rental(), show() ȣ�� ���
		// Ư�� SpecialMember�� SpecialPrint() ȣ��ǵ��� �Ͽ���.

		GeneralMember m[] = { new GeneralMember("id", "name", "address"),
				new SpecialMember("id", "name", "address", 100) };

		for (int i = 0; i < m.length; i++) {
			if (m[i] instanceof SpecialMember) {
				System.out.println("===================================");
				((SpecialMember) m[i]).specialPrint();
				m[i].rental(v[i]);
				m[i].show();
				System.out.println("===================================");
			} else {
				m[i].rental(v[i]);
				m[i].show();
			}

		}

	}
}
