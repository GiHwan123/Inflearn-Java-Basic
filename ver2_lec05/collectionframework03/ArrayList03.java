package ver2_lec05.collectionframework03;

import java.util.ArrayList;

//�÷��� �����ӿ�ũ�� �ڷᱸ���� ���� ���� ���ϰ� ����ϱ����� �ڹٿ��� �����Ǵ� ����

public class ArrayList03 {
	
	public static void main(String[] args) {
		
		ArrayList sampeList = new ArrayList();
		
		sampeList.add(1);
		sampeList.add("�ѱ�");
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
			System.out.println(i + "��° getInt ::: " + getInt);
		}
		
		ArrayList<String> strArrayList = new ArrayList<String>();
		strArrayList.add("�ѱ�");
		strArrayList.add("�̱�");
		strArrayList.add("�߱�");
		strArrayList.add("�Ϻ�");
		strArrayList.add("���þ�");
		
		for(int i = 0 ;i<strArrayList.size();i++) {
			String pStr = strArrayList.get(i);
			System.out.println("���� �̸��� : " + pStr);
		}
	}

}
