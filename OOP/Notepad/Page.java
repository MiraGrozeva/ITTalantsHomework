package notepad;

public class Page {

	private String header;
	private String text;

	Page() {
		this.header = "";
		this.text = "";
	}

	void addText(String text) {
		if (this.text != null) {
			this.text += text + "\n";
		}
	}

	void deleteText() {
		this.text = "";
	}
	
	String printPage(){
		if (this.header != null && this.text!=null) {
			return header + text;
		}
		return "";
	}
	
	boolean searchWord (String word){
		if (text.contains(word)&& !(word.equals(""))) {
			return true;
		}
		return false;
	}
	
	boolean containsDigits(){
		for (int i = 0; i <= 9; i++) {
			if (text.contains(Integer.toString(i))) {
				return true;
			}
		}
		return false;
	}
	
	void setHeader (String header){
		if (this.header!=null) {
			this.header = header + "\n";
		}
	}
}
