package notepad;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IÅlectronicDevice {

	private boolean isStart;
	
	public ElectronicSecuredNotepad(int numberOfPages, String password) throws Exception{
		super(numberOfPages, password);
	}
	@Override
	public void start() {
		isStart =true;
		System.out.println("The device is started!");
	}
	@Override
	public void stop() {
		isStart = false;
		System.out.println("The device is not started!");
		
	}
	@Override
	public boolean isStarted() {
		if (isStart) {
			return true;
			
		} else {
			return false;
		}
	}
//	@Override
//	public void addTextToPage(String text, int pageNumber) {
//		if (isStart) {
//			super.addTextToPage(text, pageNumber);
//		}else{ 
//			System.out.println("The device is not started!");
//		}
//	}
//
//	@Override
//	public void rewriteTextPage(String text, int pageNumber) {
//		if (isStart) {
//			super.rewriteTextPage(text, pageNumber);
//		}else{ 
//			System.out.println("The device is not started!");
//		}
//	}
//
//	@Override
//	public void deleteTextPage(int pageNumber) {
//		if (isStart) {
//			super.deleteTextPage(pageNumber);
//		}else{ 
//			System.out.println("The device is not started!");
//		}
//	}
//
//	@Override
//	public void printPages() {
//		if (isStart) {
//			super.printPages();
//		}else{ 
//			System.out.println("The device is not started!");
//		}
//	}
//
//	@Override
//	public void searchWord(String word) {
//		if (isStart) {
//			super.searchWord(word);
//		}else{ 
//			System.out.println("The device is not started!");
//		}
//	}
//
//	@Override
//	public void printAllPagesWithDigits() {
//		if (isStart) {
//			super.printAllPagesWithDigits();
//		}else{ 
//			System.out.println("The device is not started!");
//		}
//	}

}
