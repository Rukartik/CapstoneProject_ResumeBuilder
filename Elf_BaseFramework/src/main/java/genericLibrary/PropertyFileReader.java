package genericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/***
 * 
 * @author Yogita
 *
 */
public class PropertyFileReader implements FrameworkConstants{
	
	/**
	 * This method read the properties and return the value based on key
	 * @param key
	 * @return
	 */
	public String  getValueProperty(String key) {
		FileInputStream file;
		Properties properties = null;
		try {
			file = new FileInputStream(PROPERTYFILE_PATH);
			properties=new Properties();
			properties.load(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
		return properties.getProperty(key);
	}

}
