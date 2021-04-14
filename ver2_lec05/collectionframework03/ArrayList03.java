package ver2_lec05.collectionframework03;

import java.util.ArrayList;

//컬렉션 프레임워크는 자료구조를 더욱 쉽고 편리하게 사용하기위해 자바에서 제공되는 도구

public class ArrayList03 {
	
	public static void main(String[] args) {
		
		ArrayList sampeList = new ArrayList();
		
		sampeList.add(1);
		sampeList.add("한국");
		sampeList.add(true);
		
		System.out.println(sampeList.toString());
		
		int sampleSize = sampeList.size();
		
		for (int x = 0 ; x<sampleSize; x++) {
			Object o = sampeList.get(x);
			System.out.println("Object ::: " + o );
		}
		
		ArrayList<Integer> intArrayList = new ArrayList<Integer>();
		intArrayList.add(1);
		intArrayList.add(2);
		intArrayList.add(3);
		intArrayList.add(4);
		intArrayList.add(5);
		
		for(int i=0;i<intArrayList.size();i++) {
			int getInt = intArrayList.get(i);
			System.out.println(i + "번째 getInt ::: " + getInt);
		}
		
		ArrayList<String> strArrayList = new ArrayList<String>();
		strArrayList.add("한국");
		strArrayList.add("미국");
		strArrayList.add("중국");
		strArrayList.add("일본");
		strArrayList.add("러시아");
		
		for(int i = 0 ;i<strArrayList.size();i++) {
			String pStr = strArrayList.get(i);
			System.out.println("나라 이름들 : " + pStr);
		}
	}

}
