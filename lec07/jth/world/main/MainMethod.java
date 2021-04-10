package lec07.jth.world.main;

import lec07.jth.world.vo.chemical.Hcc;
import lec07.jth.world.vo.chemical.LGChem;
import lec07.jth.world.vo.chemical.LotteChemical;
import lec07.jth.world.vo.electronics.LGElectronics;
import lec07.jth.world.vo.electronics.SKHynix;
import lec07.jth.world.vo.electronics.SamsungElectronics;

public class MainMethod {
	
	public static void main(String[] args) {
		//������� ����
	//��ȭ�ַ�� �ɹ�Į
	Hcc hcc								= Hcc.getInstance();
	String hccName 						= String.valueOf("��ȭ�ַ���ɹ�Į");
	String hccCompanyProperty 			= String.valueOf("ȭ��");
	String hccHeadOfficeAddress 		= String.valueOf("����Ư���� �߱� û��õ�� 86 ��ȭ����");
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
		
	//����ȭ��
	LGChem lgChem						= LGChem.getInstance();
	String lgChemName						= String.valueOf("LGȭ��");
	String lgChemCompanyProperty 			= String.valueOf("ȭ��");
	String lgChemHeadOfficeAddress 		= String.valueOf("���� �������� ���Ǵ�� 128");
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
		
	
	//�Ե��ɹ�Į
	LotteChemical lotteChemical						= LotteChemical.getInstance();
	String lotteChemicalName						= String.valueOf("�Ե��ɹ�Į");
	String lotteChemicalCompanyProperty 			= String.valueOf("ȭ��");
	String lotteChemicalHeadOfficeAddress 			= String.valueOf("����Ư���� ���ı� �ø��ȷ�300, �Ե�����Ÿ�� 14F~16F");
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
	
	//��������
	LGElectronics lgElectronics						= LGElectronics.getInstance();
	String lgEName									= String.valueOf("LG����");
	String lgECompanyProperty 						= String.valueOf("����");
	String lgEHeadOfficeAddress 					= String.valueOf("����� �������� ���Ǵ�� 128 LGƮ��Ÿ��");
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
	
	//�Ｚ����
	SamsungElectronics samsungElectronics		= SamsungElectronics.getInstance();
	String samEName									= String.valueOf("�Ｚ����");
	String samECompanyProperty 						= String.valueOf("����");
	String samEHeadOfficeAddress 					= String.valueOf("��⵵ ������ ���뱸 �Ｚ�� 129");
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
	
	//SK���̴н�
	SKHynix skyhynix		= SKHynix.getInstance();
	String skyhynixName									= String.valueOf("SK���̴н�");
	String skyhynixCompanyProperty 						= String.valueOf("����");
	String skyhynixHeadOfficeAddress 					= String.valueOf("��⵵ ��õ�� �δ��� ��û��� 2091");
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
