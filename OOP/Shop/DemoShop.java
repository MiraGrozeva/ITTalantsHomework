package Shop;
import java.text.DecimalFormat;

public class DemoShop {
	public static void main(String[] args) {
		
		Shop shop = new Shop("Admiral", "Vasil.levksi.st", 500);
		shop.addProduct(new ProdPerCount("Ariana", 2.50, 5));
		shop.addProduct(new ProdPerKG("Banani", 3.00, 2));
		shop.addProduct(new ProdPerCount("Coca-cola", 2.50, 10));
		shop.addProduct(new ProdPerKG("Cheese", 1.00, 5));
		shop.addProduct(new ProdPerCount("Chocolate", 1.90, 10));
		shop.addProduct(new ProdPerCount("Lays", 2.90, 6));
		shop.addProduct(new ProdPerCount("Salam", 3.00, 10));
		shop.printProduct();
		System.out.println("---"+"After Shopping"+"----");
//		Cart cardB = new Cart(5);
		Buyer b1 = new Buyer(30.0);
		b1.setShop(shop);
		b1.setCart(new Cart(5));
		
		b1.addProduct(new ProdPerCount("Chocolate", 1.90, 3));
		b1.addProduct(new ProdPerCount("Ariana", 2.50, 2));
		b1.addProduct(new ProdPerCount("Lays", 2.90, 1));
		b1.addProduct(new ProdPerKG("Banani", 3.00, 1));
		b1.removeProduct(new ProdPerKG("Banani", 3.00, 1));
		b1.pay();
		shop.printProduct();
		System.out.println();
		DecimalFormat formatter = new DecimalFormat("#0.00");
		System.out.println("Bill: " + formatter.format(b1.getMoney()));
//		System.out.printf("%.2f",b1.getMoney());
		System.out.println("Shop case: " + formatter.format(shop.getMoneyInCase()));
		
		
	}
}
