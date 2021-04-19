package ver2_lec05.fileIO05.training02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IOManyFunction15 {
	
	public static void main(String[] args) {
		
		String path = String.valueOf("C:\\java\\eclipse\\inflearn\\file2.txt");
		
		OutputStreamWriter outputStreamWriter = null;
		
		try {
			outputStreamWriter = new OutputStreamWriter(new FileOutputStream(path),"utf-8");
			outputStreamWriter.write("����� utf-8\r\n");
			outputStreamWriter.append("���ذ� utf-8\r\n");
			outputStreamWriter.append("��������, �ر�����, ��������.");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				outputStreamWriter.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(path),"utf-8"));
			
			while(true) {
				String strReadLine= bufferedReader.readLine();
				if(strReadLine == null) {
					break;
				}
				System.out.println(strReadLine);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				bufferedReader.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
