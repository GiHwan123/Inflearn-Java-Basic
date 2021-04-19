package ver2_lec05.fileIO05.training02;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


public class IOManyFunction14 {
	
	public static void main(String[] args) {
		
		String path = String.valueOf("C:\\java\\eclipse\\inflearn\\file2.txt");
		
		BufferedWriter bufferedWriter = null;
		
		try {
			bufferedWriter = new BufferedWriter(new FileWriter(path));
			
			bufferedWriter.write('c');
			bufferedWriter.write('o');
			bufferedWriter.write('m');
			bufferedWriter.write('p');
			bufferedWriter.write('a');
			bufferedWriter.write('n');
			bufferedWriter.write('y');
			bufferedWriter.write('\r');
			bufferedWriter.write('\n');
			
			char[] message = "Human resource\r\n".toCharArray();
			
			bufferedWriter.write(message);
			bufferedWriter.write("Account");
			
			bufferedWriter.flush();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bufferedWriter.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		try {
			Desktop.getDesktop().open(new File(path));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
