package ver2_lec05.collectionframework03;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Map07 {
	
	public static void main(String[] args) {
		
		HashMap hashMap = new HashMap();
		hashMap.put("����1","�ѱ�");
		hashMap.put("����2","�̱�");
		hashMap.put("����3","�߱�");
		hashMap.put("����4","���þ�");
		hashMap.put("����5","�Ϻ�");
		
		System.out.println(hashMap);//�ؽø��� ������ ������� ���׹��� �����Ͱ� �Ҵ��(Ű,����� �����ϱ� ����)
		
		LinkedHashMap lkMap = new LinkedHashMap();
		//��ũ�� �ؽø��� Ű,����� �����ϴ��� 
		//��̸���Ʈ�� �����ϰ� ����������
		//�����Ͱ� �Ҵ��
		lkMap.put("����1","�ѱ�");
		lkMap.put("����2","�̱�");
		lkMap.put("����3","�߱�");
		lkMap.put("����4","���þ�");
		lkMap.put("����5","�Ϻ�");
		
		System.out.println(lkMap);
		
		String testA1 = "a";
		String testA2 = "a";
		
		int hc1 = testA1.hashCode();
		int hc2 = testA2.hashCode();
		
		System.out.println(hc1);//�ؽ��ڵ� ���
		System.out.println(hc2);
		
		String nationName1 = String.valueOf("�ѱ�");
		String nationName2 = String.valueOf("�ѱ�");
		
		int nn1hc = nationName1.hashCode();
		int nn2hc = nationName2.hashCode();
		
		System.out.println(nn1hc);
		System.out.println(nn2hc);
		
	}

}
