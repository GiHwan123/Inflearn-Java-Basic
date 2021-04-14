package ver2_lec05.collectionframework03;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Map07 {
	
	public static void main(String[] args) {
		
		HashMap hashMap = new HashMap();
		hashMap.put("국가1","한국");
		hashMap.put("국가2","미국");
		hashMap.put("국가3","중국");
		hashMap.put("국가4","러시아");
		hashMap.put("국가5","일본");
		
		System.out.println(hashMap);//해시맵은 순서에 상관없이 뒤죽박죽 데이터가 할당됨(키,밸류가 존재하기 때문)
		
		LinkedHashMap lkMap = new LinkedHashMap();
		//링크드 해시맵은 키,밸류가 존재하더라도 
		//어레이리스트와 동일하게 순차적으로
		//데이터가 할당됨
		lkMap.put("국가1","한국");
		lkMap.put("국가2","미국");
		lkMap.put("국가3","중국");
		lkMap.put("국가4","러시아");
		lkMap.put("국가5","일본");
		
		System.out.println(lkMap);
		
		String testA1 = "a";
		String testA2 = "a";
		
		int hc1 = testA1.hashCode();
		int hc2 = testA2.hashCode();
		
		System.out.println(hc1);//해시코드 출력
		System.out.println(hc2);
		
		String nationName1 = String.valueOf("한국");
		String nationName2 = String.valueOf("한국");
		
		int nn1hc = nationName1.hashCode();
		int nn2hc = nationName2.hashCode();
		
		System.out.println(nn1hc);
		System.out.println(nn2hc);
		
	}

}
