package Log4J;

import org.apache.logging.log4j.EventLogger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

static	Logger logger = LogManager.getLogger(Log4jDemo.class);
	
	public static void main(String[] args) {
		
		System.out.println("Maikin");
		
		logger.info("This is Information Message");
		logger.error("This is an Error Message");
		logger.warn("This is Warning Message");
		logger.fatal("This is Fatal Message");
		
		System.out.println("Completed");
		
		
	}

}
