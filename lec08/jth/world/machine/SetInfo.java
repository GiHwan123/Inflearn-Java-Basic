package lec08.jth.world.machine;

import lec07.jth.world.vo.chemical.Hcc;
import lec07.jth.world.vo.chemical.LGChem;
import lec07.jth.world.vo.chemical.LotteChemical;
import lec07.jth.world.vo.electronics.LGElectronics;
import lec07.jth.world.vo.electronics.SKHynix;
import lec07.jth.world.vo.electronics.SamsungElectronics;

public class SetInfo {
	
	public Hcc hcc = Hcc.getInstance();
	public LGChem lgChem = LGChem.getInstance();
	public LotteChemical lotteChemical =LotteChemical.getInstance();
	public LGElectronics lgElectronics = LGElectronics.getInstance();
	public SamsungElectronics samElec = SamsungElectronics.getInstance();
	public SKHynix skhynix = SKHynix.getInstance();
	
	public void SetCompanyInfo() {
		
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
	SKHynix skhynix		= SKHynix.getInstance();
	String skhynixName									= String.valueOf("SK���̴н�");
	String skhynixCompanyProperty 						= String.valueOf("����");
	String skhynixHeadOfficeAddress 					= String.valueOf("��⵵ ��õ�� �δ��� ��û��� 2091");
	int skhynixTotalEmployee 							= 28482;
	int skhynixSalesAmount 							= 253000;
	int skhynixPropertyAmount 							= 322160;
	int skhynixDebtAmount 								= 168462;
	
	skhynix.setCompanyName(skhynixName);
	skhynix.setCompanyProperty(skhynixCompanyProperty);
	skhynix.setHeadOfficeAddress(skhynixHeadOfficeAddress);
	skhynix.setTotalEmployee(skhynixTotalEmployee);
	skhynix.setSalesAmount(skhynixSalesAmount);
	skhynix.setPropertyAmount(skhynixPropertyAmount);
	skhynix.setDebtAmount(skhynixDebtAmount);
	skhynix.setCapitalAmount(skhynixPropertyAmount,skhynixDebtAmount);
	
	System.out.println(hcc.toString());
	System.out.println(lgChem.toString());
	System.out.println(lotteChemical.toString());
	System.out.println(lgElectronics.toString());
	System.out.println(samsungElectronics.toString());
	System.out.println(skhynix.toString());
	}

}
