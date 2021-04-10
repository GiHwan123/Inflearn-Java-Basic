package lec07.jth.world.main;

import lec07.jth.world.vo.chemical.Hcc;
import lec07.jth.world.vo.chemical.LGChem;
import lec07.jth.world.vo.chemical.LotteChemical;
import lec07.jth.world.vo.electronics.LGElectronics;
import lec07.jth.world.vo.electronics.SKHynix;
import lec07.jth.world.vo.electronics.SamsungElectronics;

public class MainMethod {
	
	public static void main(String[] args) {
		//기업정보 셋팅
	//한화솔루션 케미칼
	Hcc hcc								= Hcc.getInstance();
	String hccName 						= String.valueOf("한화솔루션케미칼");
	String hccCompanyProperty 			= String.valueOf("화학");
	String hccHeadOfficeAddress 		= String.valueOf("서울특별시 중구 청계천로 86 한화빌딩");
	int hccTotalEmployee 				= 5730;
	int hccSalesAmount 					= 34493;
	int hccPropertyAmount 				= 82446;
	int hccDebtAmount 					= 32289;
	
	hcc.setCompanyName(hccName);
	hcc.setCompanyProperty(hccCompanyProperty);
	hcc.setHeadOfficeAddress(hccHeadOfficeAddress);
	hcc.setTotalEmployee(hccTotalEmployee);
	hcc.setSalesAmount(hccSalesAmount);
	hcc.setPropertyAmount(hccPropertyAmount);
	hcc.setDebtAmount(hccDebtAmount);
	hcc.setCapitalAmount(hccPropertyAmount,hccDebtAmount);
		
	//엘지화학
	LGChem lgChem						= LGChem.getInstance();
	String lgChemName						= String.valueOf("LG화학");
	String lgChemCompanyProperty 			= String.valueOf("화학");
	String lgChemHeadOfficeAddress 		= String.valueOf("서울 영등포구 여의대로 128");
	int lgChemTotalEmployee 				= 20073;
	int lgChemSalesAmount 					= 286250;
	int lgChemPropertyAmount 				= 340244;
	int lgChemDebtAmount 					= 166406;
	
	lgChem.setCompanyName(lgChemName);
	lgChem.setCompanyProperty(lgChemCompanyProperty);
	lgChem.setHeadOfficeAddress(lgChemHeadOfficeAddress);
	lgChem.setTotalEmployee(lgChemTotalEmployee);
	lgChem.setSalesAmount(lgChemSalesAmount);
	lgChem.setPropertyAmount(lgChemPropertyAmount);
	lgChem.setDebtAmount(lgChemDebtAmount);
	lgChem.setCapitalAmount(lgChemPropertyAmount,lgChemDebtAmount);
		
	
	//롯데케미칼
	LotteChemical lotteChemical						= LotteChemical.getInstance();
	String lotteChemicalName						= String.valueOf("롯데케미칼");
	String lotteChemicalCompanyProperty 			= String.valueOf("화학");
	String lotteChemicalHeadOfficeAddress 			= String.valueOf("서울특별시 송파구 올림픽로300, 롯데월드타워 14F~16F");
	int lotteChemicalTotalEmployee 					= 4540;
	int lotteChemicalSalesAmount 					= 151234;
	int lotteChemicalPropertyAmount 				= 200431;
	int lotteChemicalDebtAmount 					= 59899;
	
	lotteChemical.setCompanyName(lotteChemicalName);
	lotteChemical.setCompanyProperty(lotteChemicalCompanyProperty);
	lotteChemical.setHeadOfficeAddress(lotteChemicalHeadOfficeAddress);
	lotteChemical.setTotalEmployee(lotteChemicalTotalEmployee);
	lotteChemical.setSalesAmount(lotteChemicalSalesAmount);
	lotteChemical.setPropertyAmount(lotteChemicalPropertyAmount);
	lotteChemical.setDebtAmount(lotteChemicalDebtAmount);
	lotteChemical.setCapitalAmount(lotteChemicalPropertyAmount,lotteChemicalDebtAmount);
	
	//엘지전자
	LGElectronics lgElectronics						= LGElectronics.getInstance();
	String lgEName									= String.valueOf("LG전자");
	String lgECompanyProperty 						= String.valueOf("전자");
	String lgEHeadOfficeAddress 					= String.valueOf("서울시 영등포구 여의대로 128 LG트윈타워");
	int lgETotalEmployee 							= 39765;
	int lgESalesAmount 								= 286544;
	int lgEPropertyAmount 							= 448598;
	int lgEDebtAmount 								= 284347;
	
	lgElectronics.setCompanyName(lgEName);
	lgElectronics.setCompanyProperty(lgECompanyProperty);
	lgElectronics.setHeadOfficeAddress(lgEHeadOfficeAddress);
	lgElectronics.setTotalEmployee(lgETotalEmployee);
	lgElectronics.setSalesAmount(lgESalesAmount);
	lgElectronics.setPropertyAmount(lgEPropertyAmount);
	lgElectronics.setDebtAmount(lgEDebtAmount);
	lgElectronics.setCapitalAmount(lgEPropertyAmount,lgEDebtAmount);
	
	//삼성전자
	SamsungElectronics samsungElectronics		= SamsungElectronics.getInstance();
	String samEName									= String.valueOf("삼성전자");
	String samECompanyProperty 						= String.valueOf("전자");
	String samEHeadOfficeAddress 					= String.valueOf("경기도 수원시 영통구 삼성로 129");
	int samETotalEmployee 							= 106461;
	int samESalesAmount 							= 1547000;
	int samEPropertyAmount 							= 3017521;
	int samEDebtAmount 								= 872607;
	
	samsungElectronics.setCompanyName(samEName);
	samsungElectronics.setCompanyProperty(samECompanyProperty);
	samsungElectronics.setHeadOfficeAddress(samEHeadOfficeAddress);
	samsungElectronics.setTotalEmployee(samETotalEmployee);
	samsungElectronics.setSalesAmount(samESalesAmount);
	samsungElectronics.setPropertyAmount(samEPropertyAmount);
	samsungElectronics.setDebtAmount(samEDebtAmount);
	samsungElectronics.setCapitalAmount(samEPropertyAmount,samEDebtAmount);
	
	//SK하이닉스
	SKHynix skyhynix		= SKHynix.getInstance();
	String skyhynixName									= String.valueOf("SK하이닉스");
	String skyhynixCompanyProperty 						= String.valueOf("전자");
	String skyhynixHeadOfficeAddress 					= String.valueOf("경기도 이천시 부달읍 경청대로 2091");
	int skyhynixTotalEmployee 							= 28482;
	int skyhynixSalesAmount 							= 253000;
	int skyhynixPropertyAmount 							= 322160;
	int skyhynixDebtAmount 								= 168462;
	
	skyhynix.setCompanyName(skyhynixName);
	skyhynix.setCompanyProperty(skyhynixCompanyProperty);
	skyhynix.setHeadOfficeAddress(skyhynixHeadOfficeAddress);
	skyhynix.setTotalEmployee(skyhynixTotalEmployee);
	skyhynix.setSalesAmount(skyhynixSalesAmount);
	skyhynix.setPropertyAmount(skyhynixPropertyAmount);
	skyhynix.setDebtAmount(skyhynixDebtAmount);
	skyhynix.setCapitalAmount(skyhynixPropertyAmount,skyhynixDebtAmount);
	}

}
