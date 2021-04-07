package lec04;
//구매품목

public class ProcureItemVO {

	private int id;
	private String name;
	private int quantity;
	private int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ProcureItemVO [id=" + id + ", name=" + name + ", "
				+ "quantity=" + quantity + ", price=" + price + "]";
	}
	
	//
	//private 은 같은 클래스내에서만 접근가능함. public은 다른 패키지/클래스에서도 모두 접근이 가능함
	//private 을 사용하는 이유는 데이터의 오염을 방지하기위해.(다른 클래스/패키지에서 접근하여 데이터 변경을 방지하기위해)

	
}
