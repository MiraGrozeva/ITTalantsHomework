package notepad;

import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad {

	private final String password;

	SecuredNotepad(int numberOfPages, String password) throws Exception {
		super(numberOfPages);

		boolean hasFiveSymbols = false;
		boolean hasUpperCase = false;
		boolean hasLowerCase = false;
		boolean hasDigit = false;

		if (password.length() >= 5) {
			hasFiveSymbols = true;
		}
		// for (int i = 'A'; i <'Z'; i++) {
		for (int j = 0; j < password.length(); j++) {// if(password.charAt(j)==i);
			if (Character.isUpperCase(password.charAt(j))) {
				hasUpperCase = true;
				break;
			}
		}
		// }
		// for (int i = 'a'; i <'z'; i++) {
		for (int j = 0; j < password.length(); j++) {
			if (Character.isLowerCase(password.charAt(j))) {// if(password.charAt(j)==i);
				hasLowerCase = true;
				break;
			}
		}
		// }
		// for (int i = '0'; i <'9'; i++) {
		for (int j = 0; j < password.length(); j++) {
			if (Character.isDigit(password.charAt(j))) {// if(password.charAt(j)==i);
				hasDigit = true;
				break;
			}
		}
		// }
		if (hasUpperCase && hasLowerCase && hasDigit && hasFiveSymbols) {
			this.password = password;
		} else {
			throw new Exception("You have to create strong password!");
		}
	}

	private boolean checkPassword() {
		String password;
		System.out.println("Please enter password:");
		Scanner sc = new Scanner(System.in);
		password = sc.next();
		if (this.password.equals(password)) {
			return true;
		} else {
			System.out.println("Wrong password! No Access");
			return checkPassword();
		}
	}

	@Override
	public void addTextToPage(String text, int pageNumber) {
		if (checkPassword()) {
			super.addTextToPage(text, pageNumber);
		}
	}

	@Override
	public void rewriteTextPage(String text, int pageNumber) {
		if (checkPassword()) {
			super.rewriteTextPage(text, pageNumber);
		}
	}

	@Override
	public void deleteTextPage(int pageNumber) {
		if (checkPassword()) {
			super.deleteTextPage(pageNumber);
		}
	}

	@Override
	public void printPages() {
		if (checkPassword()) {
			super.printPages();
		}
	}

	@Override
	public void searchWord(String word) {
		if (checkPassword()) {
			super.searchWord(word);
		}
	}

	@Override
	public void printAllPagesWithDigits() {
		if (checkPassword()) {
			super.printAllPagesWithDigits();
		}
	}

	public void setHeader(String header, int pageNumber) {
		if (checkPassword()) {
			super.setHeader(header, pageNumber);
		}
	}
}
