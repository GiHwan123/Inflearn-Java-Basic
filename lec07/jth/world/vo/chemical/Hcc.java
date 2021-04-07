package lec07.jth.world.vo.chemical;

//한화 솔루션 케미칼

public class Hcc {

	private static Hcc hcc= new Hcc();
	
	private Hcc(){
		
	}
	
	public static Hcc getInstance() {
		return hcc;
	}
	private int salesAmount;
	private int propertyAmount;
	private int debtAmount;
	private int capitalAmount;
	private int totalEmployee;
	private String headOfficeAddress;
	private String companyProperty;
	private String companyName;

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

	public void setCapitalAmount(int capitalAmount) {
		this.capitalAmount = capitalAmount;
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
		return "Hcc [salesAmount=" + salesAmount + ", propertyAmount=" + propertyAmount + ", debtAmount=" + debtAmount
				+ ", capitalAmount=" + capitalAmount + ", totalEmployee=" + totalEmployee + ", headOfficeAddress="
				+ headOfficeAddress + ", companyProperty=" + companyProperty + ", companyName=" + companyName + "]";
	}
	
	
}
