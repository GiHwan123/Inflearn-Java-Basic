package ver2_lec05.collectionframework03.samplecode08.repository.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class DataRepository {
	
	private static DataRepository instance = new DataRepository();
	
	public static DataRepository getInstance() {
		return instance;
	}

	public LinkedHashMap<String, Object> savedDataLkMap = null;
	public ArrayList<String> saveDataArrList = null;
	
	private DataRepository() {
		
		System.out.println("DataRepository ������");
		
		savedDataLkMap= new LinkedHashMap<String, Object>();
		saveDataArrList = new ArrayList<String>();
		
		savedDataLkMap.put("����1", "�ѱ�");
		savedDataLkMap.put("����2", "�̱�");
		savedDataLkMap.put("����3", "�߱�");
		savedDataLkMap.put("����4", "�Ϻ�");
		savedDataLkMap.put("����5", "���þ�");
		
		saveDataArrList.add("����");
		saveDataArrList.add("�ڵ���");
		saveDataArrList.add("����");
		saveDataArrList.add("IT");
		saveDataArrList.add("���÷���");
		saveDataArrList.add("�Ǽ�");
		saveDataArrList.add("������");
	}
}
