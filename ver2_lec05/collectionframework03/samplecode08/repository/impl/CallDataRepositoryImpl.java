package ver2_lec05.collectionframework03.samplecode08.repository.impl;

import ver2_lec05.collectionframework03.samplecode08.repository.CallDataRepository;

public class CallDataRepositoryImpl implements CallDataRepository{

	DataRepository dataRepository = DataRepository.getInstance();
	private static CallDataRepositoryImpl instance = new CallDataRepositoryImpl();
	
	public static CallDataRepositoryImpl getInstance(){
		return instance;
	}
	
	private CallDataRepositoryImpl() {
		System.out.println("CallDataRepositoryImpl �⺻������");
	}

	public Object getNationData(String nationName) {
		return dataRepository.savedDataLkMap.get(nationName);
	}

	public String getIndustryData(int paramIndex) {
		return dataRepository.saveDataArrList.get(paramIndex);
	}
	

}
