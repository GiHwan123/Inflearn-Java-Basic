package ver2_lec05.collectionframework03;

import java.util.LinkedList;
//LinkedList는 중간중간 데이터삽입이 다수 필요한 경우에 주로 사용됨
public class LinkedList04 {
	
	public static void main(String[] args) {
		
		LinkedList lkList = new LinkedList();
		lkList.add("alpha");
		lkList.add("bravo");
		lkList.add("charlie");
		lkList.add("delta");
		lkList.add("echo");
		
		System.out.println(lkList.toString());
		
		lkList.add(1,"good");
		
		System.out.println(lkList.toString());
		//프로그래머는 프레임워크/도구 자체에서 지원하는 기능들을 광범위하게 알고있는것이 곧 능력임.
		
	}

}
