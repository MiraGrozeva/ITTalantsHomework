package Shop;
import java.util.HashMap;
import java.util.Map.Entry;

public class Shop {

	private String name;
	private String adress;
	private double moneyInCase;
	private HashMap<String, Products> products;
	public Shop(String name, String adress, double moneyInCase) {
		this.name = name;
		this.adress = adress;
		this.moneyInCase = moneyInCase;
		products = new HashMap<>();
	}
	void addProduct(Products prod){
		if (!products.containsKey(prod.getName())) {
			products.put(prod.getName(), prod);
			return;
		}
		Products addProduct = products.get(prod.getName());
		int availability = addProduct.getAvailability();
		addProduct.setAvailability(availability+prod.getAvailability());
	}
	void removeProduct(Products prod){
		if (!products.containsKey(prod.getName())) {
			return;
		}
		int newAvailability = products.get(prod.getName()).getAvailability()-prod.getAvailability();
		if (newAvailability<0) {
			return;
		}
		products.get(prod.getName()).setAvailability(newAvailability);
		
				
	}
	void printProduct(){
		for (Entry<String, Products> i : products.entrySet()) {
			System.out.println(i.getKey() +" " + i.getValue());
		}
	}
	Products getProduct(String name){
		if (!products.containsKey(name)){
			return null;
		}
		return products.get(name);
	}
	double getMoneyInCase() {
		return moneyInCase;
	}
	public void setMoneyInCase(double moneyInCase) {
		if (moneyInCase<0) {
			System.out.println("No money in case!");
		}
		this.moneyInCase = moneyInCase;
	}
	
	
}
