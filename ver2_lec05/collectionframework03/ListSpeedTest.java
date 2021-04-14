package ver2_lec05.collectionframework03;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListSpeedTest {
	
	public static void main(String[] args) {
		
		long starMillis = System.currentTimeMillis();
		ArrayList arList = new ArrayList();
		
		for(int i=0;i< 1000000;i++) {
			arList.add(i);
		}
		
		long endMillis = System.currentTimeMillis();
		long diffMillis = endMillis - starMillis;
		
		System.out.println(" 차이 : " + diffMillis);
		
		starMillis = System.currentTimeMillis();
		LinkedList lkList = new LinkedList();
		
		for ( int i=0; i< 1000000 ; i++) {
			lkList.add(i);
		}
		
		endMillis = System.currentTimeMillis();
		diffMillis = endMillis - starMillis;
		
		System.out.println("차이 LinkedList : " + diffMillis);
		
		//링크드리스트 보다는 어레이리스트가 속도 측면에서 훨씬 이득임(연산속도가 더 빠름)
	}

}
