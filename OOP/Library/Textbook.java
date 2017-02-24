package Library;

import java.time.LocalDate;
import java.util.HashMap;

import Library.Book.Genre;
import Library.Library.Types;

public class Textbook extends ReadingObjects implements Comparable<Textbook>,Takable{

	public static enum Theme{HISTORY,GEOGRAPHY,MATH,PROGRAMING};
	private String name;
	private String author;
	private String publisher;
	private Theme theme;
	private HashMap<LocalDate, LocalDate> takes;
	private final static boolean TAKABLE = true;
	private final static int PRICE_FOR_RENT = 3;
	private final static long RENT_DAY = 150;
	public Textbook( String name, String author, String publisher, Theme theme) {
		super(Types.TEXTBOOK);
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.theme = theme;
		this.takes = new HashMap<>();
	}
	public String getName() {
		return name;
	}
	public Theme getTheme() {
		return theme;
	}
	@Override
	public HashMap<LocalDate, LocalDate> getTakes() {
		return takes;
	}
	@Override
	public void addTakes(LocalDate takesData) {
		takes.put(takesData, null);
		
	}
	@Override
	public long getRentDays() {
		return RENT_DAY;
	}
	@Override
	public int compareTo(Textbook o) {
		if (getTheme().ordinal()-o.getTheme().ordinal()==0) {
			return getName().compareTo(o.getName());
		}
		return getTheme().ordinal()-o.getTheme().ordinal();
	}
	@Override
	public String toString() {
		return name + ", " + author + ", " + theme +";" +"\n";
	}

}
