package ver2_lec05.fileIO05.training02;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class IOManyFunction12 {
	
	public static void main(String[] args) throws Exception {
		
		String path=String.valueOf("C:\\java\\eclipse\\inflearn\\fileSpeed.txt");
		
		long start1 = System.currentTimeMillis();
		for(int i=0;i<50;i++) {
			readFile(path);
		}
		long end1 = System.currentTimeMillis();
		System.out.println("�Ϲ����� ������ǲ��Ʈ������ �ɸ� �ð� : " + (end1 - start1));
		
		long start2 = System.currentTimeMillis();
		for(int i=0;i<50;i++) {
			readBuffer(path);
		}
		long end2 = System.currentTimeMillis();
		System.out.println("���۸� ����� ��Ʈ������ �ɸ� �ð� : " + (end2-start2));
		//bufferedReader�� �����͸� �����̷� �о���⶧���� �ξ� �ӵ��鿡�� �̵���.
		
		long startFile1 = System.currentTimeMillis();
		for (int i=0;i<50;i++) {
			FileInputStream fis = new FileInputStream(path);
			while(true) {
				int read = fis.read();
				if(read==-1) {
					break;
				}
				char c = (char) read;
			}
			fis.close();
		}
		long endFile1 = System.currentTimeMillis();
		System.out.println("���� �׳� �о���� �ð� : " + (endFile1-startFile1));
		
		long startFile2 = System.currentTimeMillis();
		for(int i=0;i<50;i++) {
			FileInputStream fis = new FileInputStream(path);
			byte[] byteBowl = new byte[1024];
			while(true) {
				int read=fis.read(byteBowl);
				if(read == -1) {
					break;
				}
				String message = new String(byteBowl, 0, read);
			}
			fis.close();
		}
		long endFile2 = System.currentTimeMillis();
		System.out.println("����Ʈ �迭�� �о���� �ð� : " + (endFile2 - startFile2));
	}

	public static void readFile(String path) throws Exception{
		
		FileInputStream fis = new FileInputStream(path);
		byte[] byteBowl = new byte[10];
		while(true) {
			int read = fis.read(byteBowl);
			if(read == -1) {
				break;
			}
			String message = new String(byteBowl, 0, read);
			
		}
		fis.close();
	}
	
	public static void readBuffer(String path) throws Exception{
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));
		byte[] byteBowl = new byte[10];
		while(true) {
			int read = bis.read(byteBowl);
			if(read == -1) {
				break;
			}
			String message = new String(byteBowl, 0, read);
		}
		
		bis.close();
	}
	
}
