package ver2_lec05.collectionframework03.samplecode08.service.Impl;

import ver2_lec05.collectionframework03.samplecode08.repository.CallDataRepository;
import ver2_lec05.collectionframework03.samplecode08.repository.impl.CallDataRepositoryImpl;
import ver2_lec05.collectionframework03.samplecode08.service.CallDataService;

public class CallDataServiceImpl implements CallDataService{

	CallDataRepositoryImpl callDataRepositoryImpl = null;
	
	public CallDataServiceImpl() {
		System.out.println("CallDataService 기본 생성자");
		callDataRepositoryImpl = CallDataRepositoryImpl.getInstance();
	}

	@Override
	public Object getNationData(String nationName) {
		// TODO Auto-generated method stub
		return callDataRepositoryImpl.getNationData(nationName);
	}

	@Override
	public String getIndustryData(int paramIndex) {
		// TODO Auto-generated method stub
		return callDataRepositoryImpl.getIndustryData(paramIndex);
	}

}
