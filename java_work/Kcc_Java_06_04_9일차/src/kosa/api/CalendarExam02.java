package kosa.api;

import java.util.Calendar;

public class CalendarExam02 {
	public static void main(String[] args) {
		// 2024 6월 달력 만들기
		// <2024년 6월>
		
		Calendar gc = Calendar.getInstance();
		int n = gc.getActualMaximum(Calendar.DATE); // 6월의 마지막 일 수를 구하기. 
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		gc.set(2024,5,1); // 6월 1일로 만들기
		int m = gc.get(Calendar.DAY_OF_WEEK); // 1일의 요일

		
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
