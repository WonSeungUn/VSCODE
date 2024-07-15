package kosa.io;


import java.io.File;

public class FileExam {
	public static void prinfFile(File file) {
		File f[] = file.listFiles();
		for(File f1 : f) {
			if(f1.isDirectory()) {
				System.out.println("**" + f1.getName() + "**");
				prinfFile(f1);
			} else {
				System.out.println("-" + f1.getName() + "-");
			}
		}
	}
	
	public static void main(String[] args) {
		String path = "C:\\KCC\\work\\java_work\\Kcc_Java_06_10_12����";	
		
		File f = new File(path);
		prinfFile(f);
	}
}
