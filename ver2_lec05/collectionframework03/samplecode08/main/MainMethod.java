package ver2_lec05.collectionframework03.samplecode08.main;

import ver2_lec05.collectionframework03.samplecode08.repository.impl.CallDataRepositoryImpl;
import ver2_lec05.collectionframework03.samplecode08.service.Impl.CallDataServiceImpl;

public class MainMethod {
	
	public static CallDataServiceImpl callDataService = new CallDataServiceImpl();
	
	public static void main(String[] args) {
		
		String industryData = callDataService.getIndustryData(5);
		System.out.println("industryData : " + industryData);
		
		Object getNationName = callDataService.getNationData("±¹°¡2");
		System.out.println("getNationName : " + getNationName);
	}

}
