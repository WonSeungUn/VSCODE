package kosa.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyUtil {

	// 디렉토리 복사(해당 폴더 복사해서 새로운 디렉토리를 생성한 후 모든 파일을 복사)
	public static void copyDirectory(File source, File dest) {
		if (source.isDirectory()) {
			dest.mkdirs();
			File fileList[] = source.listFiles();
			for (int i = 0; i < fileList.length; i++) {
				File sourceCopy = fileList[i];
				if (sourceCopy.isDirectory()) {
					File b = new File(dest, sourceCopy.getName());
					copyDirectory(sourceCopy, b);
				} else {
					File c = new File(dest, sourceCopy.getName());
					copyFile(sourceCopy, c);
				}
			}
		}
	}

	// 바이트 값을 가진 파일 1개를 복사하는 메소드
	public static void copyFile(File source, File dest) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		byte arr[] = new byte[1024];
		int data = 0;
		try {
			fis = new FileInputStream(source);
			fos = new FileOutputStream(dest);
			while ((data = fis.read(arr)) != -1) {
				fos.write(arr, 0, data);

			}
			System.out.println("복사 완료");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("복사실패");
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
