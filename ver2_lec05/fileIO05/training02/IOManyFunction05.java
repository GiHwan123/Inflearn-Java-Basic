package ver2_lec05.fileIO05.training02;

import java.io.FileInputStream;

public class IOManyFunction05 {

	public static void main(String[] args) {
	
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("C:\\java\\eclipse\\inflearn\\FileIOTextFile.txt");
			
			byte[] by = new byte[10];
			while(true) {
				int read = fis.read(by);
				if(read==-1) {
					break;
				}
				String msg = new String(by, 0, read);
				System.out.println(msg);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(fis!=null) {
					fis.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
}
