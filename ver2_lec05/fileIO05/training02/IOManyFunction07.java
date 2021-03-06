package ver2_lec05.fileIO05.training02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOManyFunction07 {
	
	public static void main(String[] args) {
		
		String target = String.valueOf("C:\\java\\eclipse\\inflearn\\FileIOTextFile.txt");
		String destination = String.valueOf("C:\\java\\eclipse\\inflearn\\FileIOTextFileDuplicated.txt");
		try {
			
			File destinationFile = new File(destination);
			
			if (destinationFile.exists()) {
				
				String message = String.valueOf("이미 파일이 존재하여 복사가 불가합니다.");
				throw new Exception(message);
				
			}
			
			FileInputStream fis = new FileInputStream(target);
			
			FileOutputStream fos = new FileOutputStream(destination);
			
			byte[] byteBowl = new byte[1024];
			
			while(true) {
				int read = fis.read(byteBowl);
				if(read == -1) {
					break;
				}
				fos.write(byteBowl,0,read);
			}
			
			System.out.println("파일복사에 성공했습니다.");
			
			fis.close();
			fos.close();
			
		} catch (Exception e) {
			System.out.println("파일 복사중 예외가 발생하였습니다.");
			e.printStackTrace();
			
		}
	}

}
