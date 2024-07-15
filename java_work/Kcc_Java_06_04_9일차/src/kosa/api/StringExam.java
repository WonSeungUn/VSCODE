package kosa.api;

import java.util.Arrays;

public class StringExam {
	public static void main(String[] args) {
		// 1. String ��ü ���� ����� ������
		String str = "ABC";
		String str2 = "ABC";
		String str3 = new String("ABC");
		
		
		if(str == str2) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
		
		if(str == str3) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
		
		// 2. String Ŭ���� �Һ����� Ư¡ => �޼ҵ带 ���ؼ� ��� ��ȭ�� �ִ��� �ڱ� �ڽſ��� �� ��ȭ�� ������ �ȵȴ�. => �����ڸ� ���ؼ� ��ȭ�� ������ 
		// => StringBuffer, StringBuilder (�������� Ư¡�� ����)
		// ������ �ؼ� ����� ���ڴ� �ݿ��� �� ������ ������ ���ڸ� ������ �� ����.
		String str4 = str.concat("DEF");
		System.out.println(str4);
		
		
		StringBuffer sb = new StringBuffer("ABC");
		sb.append("DEF");
		System.out.println(sb);
		
		// ������ (+) ���� ����
		String sql = "select * from board ";
		int num = 10;
		
		if(num ==10) {
			sql += "where num = 10";
		}
		System.out.println(sql);
		
		// �ش� ���ڿ��� ��ġ�� �ľ� => indexOf("���ڿ�") => �ش� ���ڿ��� �ε��� ���� (0���� �����ؼ� ����), ������ -1 ����
		System.out.println(sql.indexOf("b"));
		
		// ���ڿ� ����
		System.out.println(sql.length());
		for(int i = 0 ; i< sql.length() ; i ++) {
			System.out.print(sql.charAt(i));
			}
		
		System.out.println();
		 
		// ���ڿ� �κ� ���� : subString(5), subString(5,10) => index�� ���� 6��°���� 9��°����
		// ���� : sql ���� "board" ���ڿ��� ���
		System.out.println(sql.substring(sql.indexOf("board"),sql.indexOf("b") + 5));
		
		// ����>
		String fileName = "kosa.jpg";
		String head = "";
		String pattern = "";
		
		head = fileName.substring(0,fileName.indexOf("."));
		pattern = fileName.substring(fileName.indexOf(".")+1);
		System.out.println(head + " : " + pattern);
		
		String id = "kosa";
		String m_id = "Kosa ";
		
		// equalsIgnoreCase : ��ҹ��� ����
		// .trim() : ���� ����
		if(id.equalsIgnoreCase(m_id.trim())) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
		
		// ���ڿ� ==> String []
		String fruits = "���, ����, ����, ��";
		String arr[] = fruits.split(",");
		System.out.println(Arrays.toString(arr));
		
		
		// ���ڿ� ==> char[] ��ȯ
		String str5 = "abcdef";
		char arr2[] = str5.toCharArray();
		System.out.println(Arrays.toString(arr2));
		
		
		// ���ڿ� ==> byte[] ��ȯ
		byte arr3[] = str5.getBytes();
		System.out.println(Arrays.toString(arr3));
		
		
		// ���ڿ� <==> ������
		String str6 = "100";
		int num2 = Integer.parseInt(str6);
		System.out.println(num2);
		
		int num3 = 10;
		String str8 = 10 + "";
		System.out.println(str8);
		
		
		
		
		
		
		
		
		
		
	}
}
