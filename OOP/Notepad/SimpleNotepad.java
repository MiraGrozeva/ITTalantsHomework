package notepad;

public class SimpleNotepad implements INotepad {

	private final Page[] pages;
	private int numberOfPages;

	SimpleNotepad(int numberOfPages) {
		// index+1 -number of page
		pages = new Page[numberOfPages + 1];
		for (int i = 0; i < pages.length; i++) {
			pages[i] = new Page();
		}
	}
	public void setHeader(String header, int pageNumber) {
		if (  pageNumber > 0 && pageNumber <= this.pages.length) {
			this.pages[pageNumber].setHeader(header);
		} else {
			System.out.println("This is no page number " + pageNumber);
		}
	}

	@Override
	public void addTextToPage(String text, int pageNumber) {
		if (pageNumber > 0 && pageNumber < pages.length) {
			this.pages[pageNumber].addText(text);
		} else {
			System.out.println("Enter a page number! This is not a page number" + pageNumber);
		}
	}

	@Override
	public void rewriteTextPage(String text, int pageNumber) {
		if (pageNumber > 0 && pageNumber < pages.length) {
			this.pages[pageNumber].deleteText();
			this.addTextToPage(text, pageNumber);
		} else {
			System.out.println("Enter a page number! This is not a page number" + pageNumber);
		}
	}

	@Override
	public void deleteTextPage(int pageNumber) {
		if (pageNumber > 0 && pageNumber < pages.length) {
			this.pages[pageNumber].deleteText();
		} else {
			System.out.println("Enter a page number! This is not a page number" + pageNumber);
		}
	}

	@Override
	public void printPages() {
		for (int i = 1; i < pages.length; i++) {
			System.out.println(this.pages[i].printPage());
			System.out.println("Page: " + (i));
		}

	}

	@Override
	public void searchWord(String word) {
		boolean containsWord = false;
		System.out.println("Searching for a word: " + word);
		for (int i = 1; i < pages.length; i++) {
			if (this.pages[i].searchWord(word)) {
				containsWord = true;
				System.out.println("Page " + i + " contains the word: " + word);
			}
		}
		if (!containsWord) {
			System.out.println("The pages dosen't contains the word: " + word);
		}
	}

	@Override
	public void printAllPagesWithDigits() {
		boolean containsDigits = false;
		System.out.println("Printing all the pages contains digits");
		for (int i = 1; i < pages.length; i++) {
			if (this.pages[i].containsDigits()) {
				System.out.println(this.pages[i].printPage());
				containsDigits = true;
			}
		}
		if (!containsDigits) {
			System.out.println("There is no page that cointains digit");
		}
	}

}
