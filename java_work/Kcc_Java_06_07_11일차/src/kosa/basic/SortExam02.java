package kosa.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExam02 {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		
		list.add(new Person("ȫ�浿", 20));
		list.add(new Person("�ڱ浿", 15));
		list.add(new Person("��浿", 40));
		list.add(new Person("���浿", 25));
		list.add(new Person("���浿", 60));
		list.add(new Person("�۱浿", 55));
		
		Collections.sort(list, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// �̸��� �������� ��������
				// String : ���ʹ��ڿ�.compareTo(���ʹ��ڿ�)
				// 0 => ����(AAA) == ����(AAA)
				// -1 => ����(AAA) < ����(ABB)
				// 1 => ����(ABB) > ����(AAA)
				if(o1.getName().compareTo(o2.getName()) <0) {
					return -1;
				} else if(o1.getName().compareTo(o2.getName()) >0) {
					return 1;
				}
				return 0;
			}
			
		}); // �⺻ ����
		                                                                                                  
		System.out.print(list);
	}
}
