package ver2_lec05.collectionframework03;

import java.util.LinkedList;
//LinkedList�� �߰��߰� �����ͻ����� �ټ� �ʿ��� ��쿡 �ַ� ����
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
		//���α׷��Ӵ� �����ӿ�ũ/���� ��ü���� �����ϴ� ��ɵ��� �������ϰ� �˰��ִ°��� �� �ɷ���.
		
	}

}
