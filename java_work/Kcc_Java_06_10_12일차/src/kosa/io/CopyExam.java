package kosa.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyExam {
	public static void main(String[] args) {
		FileReader reader = null;
		FileWriter writer = null;
		char[] ar = new char[100];
		
		try {
			reader = new FileReader("poem2.txt");
			while(true) {
				int data = reader.read(ar);
				if(data == -1) break;
				System.out.println(ar);
			}
			writer = new FileWriter("poem3.txt");
			writer.write(ar);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
