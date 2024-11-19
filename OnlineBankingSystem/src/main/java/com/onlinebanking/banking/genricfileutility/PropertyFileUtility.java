package com.onlinebanking.banking.genricfileutility;
/**
 * @author AMAIR
 * This is a utility class for reading a common application data from properties file
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtility {

	/**
	 * method returns a data from properties file as per key provide
	 * @param key
	 * @return value for provided key : string
	 * @throws IOException
	 */
	public String getDataFromPropertiesFile(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./ConfigAppData/commonData.properties");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}
}
