package ver2_lec05.fileIO05.training02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class IOManyFunction13 {
	
	public static void main(String[] args) {
		
		String path = String.valueOf("C:\\java\\eclipse\\inflearn\\file2.txt");
		
		BufferedReader bufferedReader = null;
		
		try {
			bufferedReader = new BufferedReader(new FileReader(path));
			
			while(true) {
				String strReadLine = bufferedReader.readLine();
				if(strReadLine == null) {
					break;
				}
				System.out.println(strReadLine);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bufferedReader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
