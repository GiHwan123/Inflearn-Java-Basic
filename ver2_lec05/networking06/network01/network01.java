package ver2_lec05.networking06.network01;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class network01 {
	
	public static void main(String[] args) {
		try {
			
			URL url = new URL("https://www.naver.com");
			
			URLConnection urlConnection = url.openConnection();
			InputStream inputStream = urlConnection.getInputStream();
			
			BufferedReader bufferedReader
			= new BufferedReader(new InputStreamReader(inputStream,"utf-8"));
			
			while(true) {
				String readLine = bufferedReader.readLine();
				if(readLine == null)
					break;
				
				System.out.println(readLine);
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}

}
