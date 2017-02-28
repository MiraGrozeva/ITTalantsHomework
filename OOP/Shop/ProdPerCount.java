package Shop;

public class ProdPerCount extends Products{

	public ProdPerCount(String name, double price, int availability) {
		super(name, price, availability);
	}
	@Override
	public String toString() {
		return  getPrice() + ", " + getAvailability() +" br" ;
	}
	
}
