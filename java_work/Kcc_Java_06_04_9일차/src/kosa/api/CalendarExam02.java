package kosa.api;

import java.util.Calendar;

public class CalendarExam02 {
	public static void main(String[] args) {
		// 2024 6�� �޷� �����
		// <2024�� 6��>
		
		Calendar gc = Calendar.getInstance();
		int n = gc.getActualMaximum(Calendar.DATE); // 6���� ������ �� ���� ���ϱ�. 
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		gc.set(2024,5,1); // 6�� 1�Ϸ� �����
		int m = gc.get(Calendar.DAY_OF_WEEK); // 1���� ����

		
		for(int i = 1 ; i <m ; i++) {
			System.out.print("\t");
		}
		for(int i = 1 ; i <=n ; i++) {
			System.out.print(i + "\t");
			if(m%7==0) {
				System.out.println();
			}
			m++;
		}
	}
}
