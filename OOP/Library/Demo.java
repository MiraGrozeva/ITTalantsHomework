package Library;

import java.time.LocalDate;

import Library.Book.Genre;
import Library.Magazine.Category;
import Library.Textbook.Theme;

public class Demo {

	public static void main(String[] args) {
		Book b1 = new Book("Zlatnata kniga na talanta", "Daniel Koil", LocalDate.of(2013, 11, 26), "Softpres", Genre.PILOSOFY);
		Book b2 = new Book("Shifarat na leonardo", "Dan Brown", LocalDate.of(2003, 01, 26), "Unknow", Genre.NOVEL);
		Book b3 = new Book("Bruleni hulmove", "Emili Bronte", LocalDate.of(1847, 12, 01), "Unknow", Genre.NOVEL);
		Book b4 = new Book("Silata na navicite", "Unknown", LocalDate.of(2014, 11, 26), "Siela", Genre.PILOSOFY);
		Textbook t1 = new Textbook("Java za vseki", "K.Stoev", "Siela", Theme.PROGRAMING);
		Textbook t2 = new Textbook("Svqt i lichnost-12klas", "Ivan Kolev", "Anybis", Theme.HISTORY);
		Textbook t3 = new Textbook("Civilizaciq-10klas", "Ivan Ivanov", "Anybis", Theme.HISTORY);
		Magazine m1 = new Magazine("Grazia", "I don't know", Category.MODA, 5, LocalDate.of(2015, 01, 20));
		Magazine m2 = new Magazine("Grazia", "I don't know", Category.MODA, 6, LocalDate.of(2015, 01, 20));
		Magazine m3 = new Magazine("Natural world", "I don't know", Category.NATURE, 4, LocalDate.of(2015, 01, 20));
		Magazine m4 = new Magazine("Mamut", "I don't know", Category.NATURE, 7, LocalDate.of(2015, 12, 5));
		Library lib = new Library("My Library!");
		
		lib.add(b1);
		lib.add(b2);
		lib.add(b3);
		lib.add(b4);
		lib.add(t1);
		lib.add(t2);
		lib.add(t3);
		lib.add(m1);
		lib.add(m2);
		lib.add(m3);
		lib.add(m4);
		lib.printReadingObjInLibrary();
		lib.rent(b2, LocalDate.of(2017, 02, 16));
//		System.out.println("RENT");
//		lib.printReadingObjInLibrary();
	}
}
