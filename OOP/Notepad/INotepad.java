package notepad;

public interface INotepad {

	void addTextToPage(String text,int number);
	void rewriteTextPage (String text,int number);
	void deleteTextPage (int number);
	void printPages ();
	void searchWord (String word);
	void printAllPagesWithDigits();
}
