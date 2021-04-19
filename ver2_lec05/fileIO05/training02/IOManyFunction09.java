package ver2_lec05.fileIO05.training02;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;

public class IOManyFunction09 {
	
	public static void main(String[] args) {
		
		String path = String.valueOf("C:\\java\\eclipse\\inflearn\\file2.txt");
		FileWriter fileWriter = null;
		
		try {
			fileWriter = new FileWriter(path);
			
			fileWriter.write('F');
			fileWriter.write('a');
			fileWriter.write('c');
			fileWriter.write('t');
			fileWriter.write('o');
			fileWriter.write('r');
			fileWriter.write('y');
			fileWriter.write('.');
			fileWriter.write('\r');
			fileWriter.write('\n');
			
			char[] message = "Electronics.\r\n".toCharArray();
			fileWriter.write(message);
			
			fileWriter.write("Cars\r\n");
			
			fileWriter.write("중화학 공업");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				fileWriter.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		try {
			Desktop.getDesktop().open(new File(path));
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
