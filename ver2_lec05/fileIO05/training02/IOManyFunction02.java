package ver2_lec05.fileIO05.training02;

import java.io.UnsupportedEncodingException;

public class IOManyFunction02 {
	
	public static void main(String[] args) throws Exception {
		
		String strProperty = System.getProperty("file.encoding");
		System.out.println("strProperty : " + strProperty);
		
		String msg1 = String.valueOf("한글");
		//인코딩(컴퓨터가 이해가능한 값으로 변환하는 작업)
		byte[] bytes = msg1.getBytes();
		byte[] ms949s = msg1.getBytes("MS949");
		byte[] eucKrs = msg1.getBytes("EUC-KR");
		byte[] utf8s = msg1.getBytes("UTF-8");
		
		System.out.println("bytes : " + bytes);
		System.out.println("ms949s : " + ms949s);
		System.out.println("eucKrs : " + eucKrs);
		System.out.println("utf8s : " + utf8s);
		//디코딩(인간이 이해할 수 있는 값으로 변환하는 작업)
		String strBytes = new String(bytes);
		String strMs949s = new String(ms949s, "MS949");
		String strEucKrs = new String(eucKrs, "EUC-KR");
		String strUtf8s = new String(utf8s, "UTF-8");
		
		System.out.println("bytes : " + strBytes);
		System.out.println("ms949s : " + strMs949s);
		System.out.println("eucKrs : " + strEucKrs);
		System.out.println("utf8s : " + strUtf8s);
		
	}
	

}
