package Library;

import java.time.LocalDate;
import java.util.HashMap;

import org.omg.PortableInterceptor.LOCATION_FORWARD;

public interface Takable {

	HashMap<LocalDate, LocalDate> getTakes();
	void addTakes(LocalDate takesData);
	long getRentDays();
	
}
