package Library;

import java.time.LocalDate;
import java.util.HashMap;

import Library.Library.Types;


public class Book extends ReadingObjects implements Comparable<Book>,Takable {
	public static enum Genre{ACTION, DRAMA,NOVEL ,PILOSOFY};
	private String name;
	private String author;
	private LocalDate issueData;
	private String publisher;
	private Genre genre;
	private HashMap<LocalDate, LocalDate> takes;
	private final static boolean TAKABLE = true;
	private final static int PRICE_FOR_RENT = 2;
	private final static long RENT_DAY = 300;
	public Book(String name, String author, LocalDate issueData, String publisher, Genre genre) {
		super(Types.BOOK);
		this.name = name;
		this.author = author;
		this.issueData = issueData;
		this.publisher = publisher;
		this.genre = genre;
		this.takes = new HashMap<>();
	}
	
	public LocalDate getIssueData() {
		return issueData;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setIssueData(LocalDate issueData) {
		this.issueData = issueData;
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
	public int compareTo(Book o) {
		if (getGenre().ordinal()-o.getGenre().ordinal()==0) {
			return o.getIssueData().compareTo(getIssueData());
			
		}
		return getGenre().ordinal()-o.getGenre().ordinal();
	}

	@Override
	public String toString() {
		return name + ", " + author + ", " + publisher + ", " + genre + ", " +issueData +";" +"\n";
	}
}
