package Library;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

public class Library {

	public static enum Types {BOOK,MAGAZINE,TEXTBOOK};
	private String name;
	private HashMap<Types, TreeSet<ReadingObjects>> readableObj;
	private HashMap<ReadingObjects, HashMap<LocalDate,LocalDate>> taken;
	
	public Library(String name) {
		this.name = name;
		this.readableObj = new HashMap<>();
		this.taken = new HashMap<>();
	}

	void add(ReadingObjects obj){
		Library.Types type = obj.getType();
		if (!readableObj.containsKey(type)) {
			readableObj.put(type, new TreeSet<>());
		}
		TreeSet<ReadingObjects> temp = readableObj.get(type);
		temp.add(obj);
		readableObj.put(type, temp);
	}
	void rent(ReadingObjects objToRent, LocalDate takesData){
		if (!taken.containsKey(objToRent)) {
			if (objToRent instanceof Takable) {
				((Takable)objToRent).addTakes(takesData);
				long addDays = ((Takable)objToRent).getRentDays();
				HashMap<LocalDate, LocalDate> temp = new HashMap<>();
				temp.put(takesData, takesData.plusDays(addDays));
				taken.put(objToRent, temp);
			}else{
				System.out.println("You can't rent this!");
			}
		}
	}
	void printReadingObjInLibrary(){
		System.out.println("==="+getName()+"===");
		System.out.println();
		for (Entry<Types, TreeSet<ReadingObjects>> i : readableObj.entrySet()) {
			System.out.println(i.getKey()+" \n " + i.getValue());
		}
	}

	public String getName() {
		return name;
	}

}
