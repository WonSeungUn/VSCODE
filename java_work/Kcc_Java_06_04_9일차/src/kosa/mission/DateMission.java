package kosa.mission;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateMission {
	public static void main(String[] args) {

		// 키보드 => 날짜 입력 2014/06/04
		// 입사일을 입력 받아 => 몇년 몇개월 재직 중
		// 494~547p

		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 :");
		Date inDate = null;

		while (sc.hasNextLine()) {
			try {
				inDate = df.parse(sc.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("다시 입력하세요");
			}
		}
		
		Calendar past = Calendar.getInstance();			// 입사일
		past.setTime(inDate);
		Calendar today = Calendar.getInstance();		// 현재
		
		// 총일수
		long day = (today.getTimeInMillis() - past.getTimeInMillis())/(24*60*60*1000);
		System.out.println(day);
		
		int year = (int)(day/365);
		int month = (int)(day%365) /30 ;
		
		System.out.println("재직 기간 : " + year + "년" + month + "개월 근속");
		

//	Scanner sc = new Scanner(System.in);
//	
//	String s = sc.nextLine();
//	String[] ar = s.split("/");
//	int s_year = Integer.parseInt(ar[0]);
//	int s_month = Integer.parseInt(ar[1]);
//	int s_date = Integer.parseInt(ar[2]);
//	Calendar c = Calendar.getInstance();
//	int n = c.getActualMaximum(Calendar.DAY_OF_MONTH);
//	
//	int year = c.get(Calendar.YEAR) - s_year;
//	int month = (c.get(Calendar.MONTH)+1) - s_month;
//	int date = c.get(Calendar.DATE) - s_date;
//	
//	if(month <0) {
//		year = year -1;
//		month = ((c.get(Calendar.MONTH)+1) - s_month) + 12;
//	}
//	
//	if(date <0) {
//		date = (c.get(Calendar.DATE) - s_date) + n;
//		month = month -1;
//	}
//	
//	System.out.println(year + "년 " + month + "개월 " + + date + "일 재직중");
	}
}
