package notepad;

public class NotepadDemo {

	public static void main(String[] args) throws Exception {
//		SecuredNotepad pad1 = new SecuredNotepad(6, "d48d");
////		SimpleNotepad pad1 = new SimpleNotepad(6);
//		pad1.addTextToPage("This text is styled with some of the text formatting properties.", 2);
//		pad1.addTextToPage("The heading uses the text-align, text-transform, and color properties. The paragraph 142..", 5);
//		pad1.printPages();
//		pad1.deleteTextPage(2);
//		pad1.printAllPagesWithDigits();
//		pad1.rewriteTextPage("The paragraph 142..", 5);
//		pad1.printPages();
		
		
		ElectronicSecuredNotepad elPad= new ElectronicSecuredNotepad(25,"d481D");
		
//		elPad.start();
		elPad.addTextToPage("Tak me away", 23);
		elPad.printPages();
////		elPad.deleteTextPage(23);
////		elPad.printPages();
//		elPad.addTextToPage("2", 1);
//		elPad.addTextToPage("6", 5);
//		elPad.printAllPagesWithDigits();
//		elPad.stop();
//		elPad.isStarted();
//		elPad.printPages();
		
//		elPad.setHeader("da", 1);
//		elPad.addTextToPage("YEAA", 1);
//		elPad.printPages();
	}

}
