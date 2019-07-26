package root;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Service {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public void play(){

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
		String time = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now().withNano(0));
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("full datetime with milliseconds");
		System.out.println(ldt.toString());
		System.out.println("full datetime without milliseconds");
		System.out.println(ldt.withNano(0));
		System.out.println("full datetime without T & without milliseconds");
		System.out.println(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now().withNano(0)));
		System.out.println("Dates and slf4j logger");
		logger.info(time + " - (STATUS CODE = {}) => {}", 200, "full Phone directory retrieved.");
	}

}
