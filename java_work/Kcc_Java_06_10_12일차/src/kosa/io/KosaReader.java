package kosa.io;

import java.io.FileReader;
import java.util.Arrays;

public class KosaReader {
	public static void main(String[] args) {
		// ����(poem.txt)�� �մ� ���ڿ� ������ �о����
		FileReader reader = null;
		char arr[] = new char[100];

		try {
			// FileReader ����
			reader = new FileReader("poem.txt");
			while (true) {
				Arrays.fill(arr, ' ');
				int data = reader.read(arr);
				if (data == -1)
					break;
				System.out.println(arr);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (Exception e2) {
			}
		}
	}
}
