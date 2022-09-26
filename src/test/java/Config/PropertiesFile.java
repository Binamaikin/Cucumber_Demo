package Config;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String[] args) {
		getproperties();
	}
	
		public static void getproperties() {
			try {
				Properties prop= new Properties();
				String projectpath=	System.getProperty("user.dir");

				InputStream input = new FileInputStream(projectpath+"/src/test/java/Config/Config.properties");
	
				prop.load(input);
			String browser =	prop.getProperty("Browser");
			System.out.println(browser);
			
			}catch (Exception exp) {
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				exp.getStackTrace();
			}
			
		} 
			
			
			
		
	}


