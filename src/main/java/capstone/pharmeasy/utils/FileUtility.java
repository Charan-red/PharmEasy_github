package capstone.pharmeasy.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	
public static void fetchdatafromExcel() {
		
		
	}

	public static void writedatatoExcel() {
		
		
	}
	
	public static Properties loadProperties(File configfile) throws IOException {
		FileInputStream fis = new FileInputStream(configfile);
		Properties properties = new Properties();
		properties.load(fis);
		return properties;
	}

	public static String readProperties(Properties properties, String key) {
		
		return properties.getProperty(key);
	}


}
