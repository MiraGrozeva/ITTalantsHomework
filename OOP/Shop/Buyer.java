package Shop;
import java.util.HashMap;
import java.util.Map.Entry;

public class Buyer implements IBuyer {

	private Shop shop;
	private double money;
	private Cart cart;
	public Buyer( double money) {
		this.money = money;
	}

	public void setCart(Cart cartMaxQuantity) {
		this.cart = cartMaxQuantity;
	}

	void setShop(Shop newShop){
		shop = newShop;
	}
	@Override
	public void addProduct(Products product) {
		cart.addProduct(product);
		shop.removeProduct(product);
	}
	@Override
	public void removeProduct(Products product) {
		cart.removeProduct(product);
		shop.addProduct(product);
	}
	@Override
	public void pay() {
		double productPrice = 0;
		HashMap<String, Products> getProductsInCart = cart.getProducts();
		for (Entry<String, Products> i : getProductsInCart.entrySet()) {
			productPrice += i.getValue().getPrice()*i.getValue().getAvailability();
		}
		if (money<productPrice) {
			System.out.println("You don't have enought money");
		}
		shop.setMoneyInCase(shop.getMoneyInCase()+productPrice);
		money-=productPrice;
	}

	public double getMoney() {
		return money;
	}
}
