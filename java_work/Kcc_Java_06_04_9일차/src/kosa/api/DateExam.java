package kosa.api;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {
	public static void main(String[] args) {
//		Date now = new Date();
//		String str = now.toString();
//		System.out.println(str);
//		
//		SimpleDateFormat sdf =
//				new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
//		System.out.println(sdf.format(now));
		
		// 키보드로부터 날짜 입력 받기 2024/06/04
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		Date date = null;
		
		try {
			date = df.parse("2024/06/24");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println(date);
	}
}
