package Shop;

public class ProdPerKG extends Products{

	public ProdPerKG(String name, double price, int availability) {
		super(name, price, availability);
	}

	@Override
	public String toString() {
		return  getPrice() + ", " + getAvailability() +"kg" ;
	}
	
}

