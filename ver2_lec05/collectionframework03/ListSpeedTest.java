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
		
		System.out.println(" ���� : " + diffMillis);
		
		starMillis = System.currentTimeMillis();
		LinkedList lkList = new LinkedList();
		
		for ( int i=0; i< 1000000 ; i++) {
			lkList.add(i);
		}
		
		endMillis = System.currentTimeMillis();
		diffMillis = endMillis - starMillis;
		
		System.out.println("���� LinkedList : " + diffMillis);
		
		//��ũ�帮��Ʈ ���ٴ� ��̸���Ʈ�� �ӵ� ���鿡�� �ξ� �̵���(����ӵ��� �� ����)
	}

}
