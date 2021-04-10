package lec08.jth.world.vo.electronics;

public class LGElectronics {
	
	private static LGElectronics LGElectronics = new LGElectronics();
	private LGElectronics() {
		
	}
	
	public static LGElectronics getInstance() {
		return LGElectronics;
	}
	
	private int salesAmount;		//�����
	private int propertyAmount;		//�ڻ��
	private int debtAmount;			//��ä��
	private int capitalAmount;		//�ں���
	private int totalEmployee;		//�� ������
	private String headOfficeAddress;	//���� �ּ�
	private String companyProperty;		//ȸ�� �Ӽ�(����,it,ȭ��,����)
	private String companyName;			//ȸ���
	public int getSalesAmount() {
		return salesAmount;
	}

	public void setSalesAmount(int salesAmount) {
		this.salesAmount = salesAmount;
	}

	public int getPropertyAmount() {
		return propertyAmount;
	}

	public void setPropertyAmount(int propertyAmount) {
		this.propertyAmount = propertyAmount;
	}

	public int getDebtAmount() {
		return debtAmount;
	}

	public void setDebtAmount(int debtAmount) {
		this.debtAmount = debtAmount;
	}

	public int getCapitalAmount() {
		return capitalAmount;
	}

	public void setCapitalAmount(int propertyAmount, int debtAmount) {
		this.capitalAmount = propertyAmount - debtAmount;
	}

	public int getTotalEmployee() {
		return totalEmployee;
	}

	public void setTotalEmployee(int totalEmployee) {
		this.totalEmployee = totalEmployee;
	}

	public String getHeadOfficeAddress() {
		return headOfficeAddress;
	}

	public void setHeadOfficeAddress(String headOfficeAddress) {
		this.headOfficeAddress = headOfficeAddress;
	}

	public String getCompanyProperty() {
		return companyProperty;
	}

	public void setCompanyProperty(String companyProperty) {
		this.companyProperty = companyProperty;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "LGElectronics [salesAmount=" + salesAmount + ", propertyAmount=" + propertyAmount + ", debtAmount="
				+ debtAmount + ", capitalAmount=" + capitalAmount + ", totalEmployee=" + totalEmployee
				+ ", headOfficeAddress=" + headOfficeAddress + ", companyProperty=" + companyProperty + ", companyName="
				+ companyName + "]";
	}
	
	

}
