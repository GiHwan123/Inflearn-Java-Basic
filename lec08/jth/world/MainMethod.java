package lec08.jth.world;

import java.util.Scanner;

import lec08.jth.world.machine.SetInfo;

public class MainMethod {
	
	public static void main(String[] args) {
		SetInfo setinfo = new SetInfo();
		setinfo.SetCompanyInfo();
		
		Scanner scanner = new Scanner(System.in);
		boolean isLoopContinue = true;
		
		while(isLoopContinue) {
			System.out.println("ȸ�����?");
			String scanNext = scanner.next();
			
			String lowerScanNext = scanNext.toLowerCase();
			System.out.println(lowerScanNext);
			
			whatCompanyCoose(lowerScanNext, setinfo, scanner);
			System.out.println("�����Ͻðڽ��ϱ�? ����� 1�� �ƴϸ� �ƹ� ���ڳ� �Է��ϼ���.");
			int result = scanner.nextInt();
			if (result == 1 ) {
				isLoopContinue = false;
				System.out.println("����Ǿ����ϴ�.");
				
			}
		}
		
		
	}
	
	public static void whatCompanyCoose(String lowerScanNext,SetInfo setinfo, Scanner scanner) {
		int kindCompany = 0 ;//ȸ������
		int resultKindInfo =0;//������ ���� ����
		
		if(lowerScanNext.contains("��ȭ��")) {
			System.out.println("��ȭ �ַ�� �ɹ�Į ������ �����ϼ̽��ϴ�.");
			resultKindInfo=askWhatTypeAnswerWant(scanner, setinfo);
			System.out.println("resultKindInfo : " + resultKindInfo);
			
			kindCompany=1;
		}else if (lowerScanNext.contains("lgȭ")) {
            System.out.println("����ȭ�� ������ �����ϼ̽��ϴ�.");

            resultKindInfo = askWhatTypeAnswerWant(scanner, setinfo);
            System.out.println("resultKindInfo : " + resultKindInfo);

            kindCompany = 2;
        } else if (lowerScanNext.contains("�Ե���")) {
            System.out.println("�Ե��ɹ�Į ������ �����ϼ̽��ϴ�.");

            resultKindInfo = askWhatTypeAnswerWant(scanner, setinfo);
            System.out.println("resultKindInfo : " + resultKindInfo);

            kindCompany = 3;
        } else if (lowerScanNext.contains("lg��")) {
            System.out.println("�������� ������ �����ϼ̽��ϴ�.");

            resultKindInfo = askWhatTypeAnswerWant(scanner, setinfo);
            System.out.println("resultKindInfo : " + resultKindInfo);

            kindCompany = 4;
        } else if (lowerScanNext.contains("�Ｚ��")) {
            System.out.println("�Ｚ���� ������ �����ϼ̽��ϴ�.");

            resultKindInfo = askWhatTypeAnswerWant(scanner, setinfo);
            System.out.println("resultKindInfo : " + resultKindInfo);

            kindCompany = 5;
        } else if (lowerScanNext.contains("sk��")) {
            System.out.println("�����������̴н� ������ �����ϼ̽��ϴ�.");

            resultKindInfo = askWhatTypeAnswerWant(scanner, setinfo);
            System.out.println("resultKindInfo : " + resultKindInfo);

            kindCompany = 6;
        }
		
		showCompanyInfo(kindCompany, resultKindInfo, setinfo);
	}
	
	public static int askWhatTypeAnswerWant(Scanner scanner,SetInfo setinfo) {
        System.out.println("� ������ ���ϼ���?");
        System.out.println("1�� ȸ���");
        System.out.println("2�� ȸ���ַ»��");
        System.out.println("3�� ȸ����ġ");
        System.out.println("4�� �� �ο�");
        System.out.println("5�� �����");
        System.out.println("6�� �ڻ��");
        System.out.println("7�� ��ä��");
        System.out.println("8�� �ں���");
        
        String chooseAnswerType=scanner.next();
        chooseAnswerType=chooseAnswerType.trim();
        
        int chsaType= 0;
        
        try {
        	chsaType = Integer.parseInt(chooseAnswerType);
        }catch(Exception e) {
        	System.out.println("�߸��ȵ������� ���α׷� �����մϴ�.");
        	System.out.println("���ڸ� �Է��ϼž� �մϴ�.");
        	
        }
        
        return chsaType;
	}
	
	public static void showCompanyInfo(int kindCompany,int resultKindInfo, SetInfo setInfo) {
		switch(kindCompany) {
		case 1:
			System.out.println("��ȭ�ַ���ɹ�Į �Դϴ�.");
			switch(resultKindInfo) {
			case 1:
				String strCompanyName = setInfo.hcc.getCompanyName();
				System.out.println("ȸ��� : " + strCompanyName);
				break;
			case 2 :
                String strCompanyProperty = setInfo.hcc.getCompanyProperty();
                System.out.println("ȸ�� ��� �о� : " + strCompanyProperty);
                break;
            case 3 :
                String strHeadOfficeAddress = setInfo.hcc.getHeadOfficeAddress();
                System.out.println("ȸ�� �ּ� : " + strHeadOfficeAddress);
                break;
            case 4 :
                int intTotalEmployee = setInfo.hcc.getTotalEmployee();
                System.out.println("ȸ�� ���ο� : " + intTotalEmployee);
                break;
            case 5 :
                int intSalesAmount = setInfo.hcc.getSalesAmount();
                System.out.println("ȸ�� ����� : " + intSalesAmount);
                break;
            case 6 :
                int intPropertyAmount = setInfo.hcc.getPropertyAmount();
                System.out.println("ȸ�� �ڻ�� : " + intPropertyAmount);
                break;
            case 7 :
                int intDebtAmount = setInfo.hcc.getDebtAmount();
                System.out.println("ȸ�� ��ä�� : " + intDebtAmount);
                break;
            case 8 :
                int intCapitalAmount = setInfo.hcc.getCapitalAmount();
                System.out.println("ȸ�� �ں��� : " + intCapitalAmount);
                break;
        }

        break;
    case 2 :
        System.out.println("LGȭ���Դϴ�.");
        switch (resultKindInfo) {
            case 1 :
                String strCompanyName = setInfo.lgChem.getCompanyName();
                System.out.println("ȸ��� : " + strCompanyName);
                break;
            case 2 :
                String strCompanyProperty = setInfo.lgChem.getCompanyProperty();
                System.out.println("ȸ�� ��� �о� : " + strCompanyProperty);
                break;
            case 3 :
                String strHeadOfficeAddress = setInfo.lgChem.getHeadOfficeAddress();
                System.out.println("ȸ�� �ּ� : " + strHeadOfficeAddress);
                break;
            case 4 :
                int intTotalEmployee = setInfo.lgChem.getTotalEmployee();
                System.out.println("ȸ�� ���ο� : " + intTotalEmployee);
                break;
            case 5 :
                int intSalesAmount = setInfo.lgChem.getSalesAmount();
                System.out.println("ȸ�� ����� : " + intSalesAmount);
                break;
            case 6 :
                int intPropertyAmount = setInfo.lgChem.getPropertyAmount();
                System.out.println("ȸ�� �ڻ�� : " + intPropertyAmount);
                break;
            case 7 :
                int intDebtAmount = setInfo.lgChem.getDebtAmount();
                System.out.println("ȸ�� ��ä�� : " + intDebtAmount);
                break;
            case 8 :
                int intCapitalAmount = setInfo.lgChem.getCapitalAmount();
                System.out.println("ȸ�� �ں��� : " + intCapitalAmount);
                break;
        }
        break;
    case 3 :
        System.out.println("�Ե��ɹ�Į�Դϴ�.");
        switch (resultKindInfo) {
            case 1 :
                String strCompanyName = setInfo.lotteChemical.getCompanyName();
                System.out.println("ȸ��� : " + strCompanyName);
                break;
            case 2 :
                String strCompanyProperty = setInfo.lotteChemical.getCompanyProperty();
                System.out.println("ȸ�� ��� �о� : " + strCompanyProperty);
                break;
            case 3 :
                String strHeadOfficeAddress = setInfo.lotteChemical.getHeadOfficeAddress();
                System.out.println("ȸ�� �ּ� : " + strHeadOfficeAddress);
                break;
            case 4 :
                int intTotalEmployee = setInfo.lotteChemical.getTotalEmployee();
                System.out.println("ȸ�� ���ο� : " + intTotalEmployee);
                break;
            case 5 :
                int intSalesAmount = setInfo.lotteChemical.getSalesAmount();
                System.out.println("ȸ�� ����� : " + intSalesAmount);
                break;
            case 6 :
                int intPropertyAmount = setInfo.lotteChemical.getPropertyAmount();
                System.out.println("ȸ�� �ڻ�� : " + intPropertyAmount);
                break;
            case 7 :
                int intDebtAmount = setInfo.lotteChemical.getDebtAmount();
                System.out.println("ȸ�� ��ä�� : " + intDebtAmount);
                break;
            case 8 :
                int intCapitalAmount = setInfo.lotteChemical.getCapitalAmount();
                System.out.println("ȸ�� �ں��� : " + intCapitalAmount);
                break;
        }
        break;
    case 4 :
        System.out.println("LG�����Դϴ�.");
        switch (resultKindInfo) {
            case 1 :
                String strCompanyName = setInfo.lgElectronics.getCompanyName();
                System.out.println("ȸ��� : " + strCompanyName);
                break;
            case 2 :
                String strCompanyProperty = setInfo.lgElectronics.getCompanyProperty();
                System.out.println("ȸ�� ��� �о� : " + strCompanyProperty);
                break;
            case 3 :
                String strHeadOfficeAddress = setInfo.lgElectronics.getHeadOfficeAddress();
                System.out.println("ȸ�� �ּ� : " + strHeadOfficeAddress);
                break;
            case 4 :
                int intTotalEmployee = setInfo.lgElectronics.getTotalEmployee();
                System.out.println("ȸ�� ���ο� : " + intTotalEmployee);
                break;
            case 5 :
                int intSalesAmount = setInfo.lgElectronics.getSalesAmount();
                System.out.println("ȸ�� ����� : " + intSalesAmount);
                break;
            case 6 :
                int intPropertyAmount = setInfo.lgElectronics.getPropertyAmount();
                System.out.println("ȸ�� �ڻ�� : " + intPropertyAmount);
                break;
            case 7 :
                int intDebtAmount = setInfo.lgElectronics.getDebtAmount();
                System.out.println("ȸ�� ��ä�� : " + intDebtAmount);
                break;
            case 8 :
                int intCapitalAmount = setInfo.lgElectronics.getCapitalAmount();
                System.out.println("ȸ�� �ں��� : " + intCapitalAmount);
                break;
        }
        break;
    case 5 :
        System.out.println("�Ｚ�����Դϴ�.");
        switch (resultKindInfo) {
            case 1 :
                String strCompanyName = setInfo.samElec.getCompanyName();
                System.out.println("ȸ��� : " + strCompanyName);
                break;
            case 2 :
                String strCompanyProperty = setInfo.samElec.getCompanyProperty();
                System.out.println("ȸ�� ��� �о� : " + strCompanyProperty);
                break;
            case 3 :
                String strHeadOfficeAddress = setInfo.samElec.getHeadOfficeAddress();
                System.out.println("ȸ�� �ּ� : " + strHeadOfficeAddress);
                break;
            case 4 :
                int intTotalEmployee = setInfo.samElec.getTotalEmployee();
                System.out.println("ȸ�� ���ο� : " + intTotalEmployee);
                break;
            case 5 :
                int intSalesAmount = setInfo.samElec.getSalesAmount();
                System.out.println("ȸ�� ����� : " + intSalesAmount);
                break;
            case 6 :
                int intPropertyAmount = setInfo.samElec.getPropertyAmount();
                System.out.println("ȸ�� �ڻ�� : " + intPropertyAmount);
                break;
            case 7 :
                int intDebtAmount = setInfo.samElec.getDebtAmount();
                System.out.println("ȸ�� ��ä�� : " + intDebtAmount);
                break;
            case 8 :
                int intCapitalAmount = setInfo.samElec.getCapitalAmount();
                System.out.println("ȸ�� �ں��� : " + intCapitalAmount);
                break;
        }
        break;
    case 6 :
        System.out.println("SK���̴н��Դϴ�.");
        switch (resultKindInfo) {
            case 1 :
                String strCompanyName = setInfo.skhynix.getCompanyName();
                System.out.println("ȸ��� : " + strCompanyName);
                break;
            case 2 :
                String strCompanyProperty = setInfo.skhynix.getCompanyProperty();
                System.out.println("ȸ�� ��� �о� : " + strCompanyProperty);
                break;
            case 3 :
                String strHeadOfficeAddress = setInfo.skhynix.getHeadOfficeAddress();
                System.out.println("ȸ�� �ּ� : " + strHeadOfficeAddress);
                break;
            case 4 :
                int intTotalEmployee = setInfo.skhynix.getTotalEmployee();
                System.out.println("ȸ�� ���ο� : " + intTotalEmployee);
                break;
            case 5 :
                int intSalesAmount = setInfo.skhynix.getSalesAmount();
                System.out.println("ȸ�� ����� : " + intSalesAmount);
                break;
            case 6 :
                int intPropertyAmount = setInfo.skhynix.getPropertyAmount();
                System.out.println("ȸ�� �ڻ�� : " + intPropertyAmount);
                break;
            case 7 :
                int intDebtAmount = setInfo.skhynix.getDebtAmount();
                System.out.println("ȸ�� ��ä�� : " + intDebtAmount);
                break;
            case 8 :
                int intCapitalAmount = setInfo.skhynix.getCapitalAmount();
                System.out.println("ȸ�� �ں��� : " + intCapitalAmount);
                break;
        }
        break;
    default:
        System.out.println("�ùٸ� ���� �����ϼ���.");
        break;
			}
		}
	}
