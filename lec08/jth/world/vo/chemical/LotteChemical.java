package lec08.jth.world.vo.chemical;


public class LotteChemical {
	
	private static LotteChemical LotteChemical = new LotteChemical();
	private LotteChemical() {
		
	}
	
	public static LotteChemical getInstance() {
		return LotteChemical;
	}
	
	private int salesAmount;		//매출액
	private int propertyAmount;		//자산액
	private int debtAmount;			//부채액
	private int capitalAmount;		//자본액
	private int totalEmployee;		//총 종업원
	private String headOfficeAddress;	//본점 주소
	private String companyProperty;		//회사 속성(조선,it,화학,전자)
	private String companyName;			//회사명
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
		return "LotteChemical [salesAmount=" + salesAmount + ", propertyAmount=" + propertyAmount + ", debtAmount="
				+ debtAmount + ", capitalAmount=" + capitalAmount + ", totalEmployee=" + totalEmployee
				+ ", headOfficeAddress=" + headOfficeAddress + ", companyProperty=" + companyProperty + ", companyName="
				+ companyName + "]";
	}
	
	
}
