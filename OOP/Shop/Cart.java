package Shop;
import java.util.HashMap;

public class Cart {
	
	private HashMap<String, Products> products;
	private int maxQuantity;
	private int currentQuantity;
	public Cart(int maxQuantity) {
		this.products = new HashMap<>();
		this.maxQuantity = maxQuantity;
		this.currentQuantity = 0;
	}
	void addProduct(Products product){
		if (currentQuantity+product.getAvailability()>=maxQuantity) {
			return;
		}
		if (!products.containsKey(product.getName())) {
			products.put(product.getName(), product);
			return;
		}
		Products addInCart = products.get(product.getName());
		addInCart.setAvailability(addInCart.getAvailability()+product.getAvailability());

	}
	void removeProduct(Products product){
		if (!products.containsKey(product.getName())) {
			return;
		}
		int newAvailability = products.get(product.getName()).getAvailability()-product.getAvailability();
		if (newAvailability<0) {
			return;
		}
		products.get(product.getName()).setAvailability(newAvailability);
	}
	public HashMap<String, Products> getProducts() {
		return products;
	}
	
}
