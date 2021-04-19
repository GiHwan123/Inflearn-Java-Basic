package ver2_lec05.fileIO05.training02;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class IOManyFunction10 {
	
	public static void main(String[] args) {
		
		String path = String.valueOf("C:\\java\\eclipse\\inflearn\\file2.txt");
		
		BufferedInputStream bis = null;
		
		try {
			
			bis = new BufferedInputStream(new FileInputStream(path));
			byte[] byteBowl = new byte[10];
			while(true) {
				int read = bis.read(byteBowl);
				if(read == 1) {
					break;
				}
				
				String message = new String(byteBowl, 0, read);
				System.out.println(message);
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally {
			try {
				if(bis!=null) {
					bis.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		}
	}

}
