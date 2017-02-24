package Library;

import java.time.LocalDate;

import Library.Library.Types;

public class Magazine extends ReadingObjects implements Comparable<Magazine> {
	
	public static enum Category{MODA,NATURE};
	private String name;
	private String publisher;
	private Category category;
	private int number;
	private LocalDate issueDate;
	private final static boolean TAKABLE = false;
	
	public Magazine(String name, String publisher,Category category, int number, LocalDate issueDate) {
		super(Types.MAGAZINE);
		this.name = name;
		this.publisher = publisher;
		this.category = category;
		this.number = number;
		this.issueDate = issueDate;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}
	
	public Category getCategory() {
		return category;
	}

	public static boolean isTakable() {
		return TAKABLE;
	}

	@Override
	public int compareTo(Magazine o) {
//		
			if(this.getName().compareTo(o.getName())==0){
				return this.getNumber()-o.getNumber();
			}
//		}
//			if(getCategory().ordinal()-o.getCategory().ordinal()==0){	
			return getName().compareTo(o.getName());
	}

	@Override
	public String toString() {
		return name + ", " + number + ", " +category  + ";"+"\n";
	}

	
}
