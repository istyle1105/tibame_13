package HW1217;

public abstract class Pen implements IWritable {
	protected String brand;
	protected int price;
	
	//123
	//Constructor
	//Constructor
	//Constructor
	public Pen() {
	}
	
	//Constructor
	public Pen(String brand,int price) {
		this.brand=brand;
		this.price=price;
	}
	
	public void SetBrand(String brand) {
		this.brand=brand;
	}
	
	public void SetPrice(int price) {
		this.price=price;
	}
	
	public String GetBrand() {
		return brand;
	}
	
	public int GetPrice() {
		return price;
	}
	
	public abstract void write();
		
}
