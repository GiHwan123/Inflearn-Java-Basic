package ver2_lec05.fileIO05.training02;

import java.io.FileReader;

public class IOManyFunction08 {
	
	public static void main(String[] args) {
		
		FileReader fileReader = null;
		String path = String.valueOf("C:\\java\\eclipse\\inflearn\\file.txt");
		
		try {
			fileReader = new FileReader(path);
			while(true) {
				int read = fileReader.read();
				if(read == -1) {
					break;
				}
				System.out.print((char)read);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				fileReader.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
