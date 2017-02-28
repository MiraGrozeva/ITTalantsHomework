package Shop;

public abstract class Products {
	
	private String name;
	private double price;
	private int availability;
	
	public Products(String name, double price, int availability) {
		this.name = name;
		this.price = price;
		this.availability = availability;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getAvailability() {
		return availability;
	}

	public void setAvailability(int availability) {
		if (availability<0) {
			return;
		}
		this.availability = availability;
	}
}
