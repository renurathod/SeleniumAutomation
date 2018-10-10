package genericlibrary;

import java.io.FileInputStream;
import java.util.Properties;

public class propertyHelper {

	public String getValues(String key) throws Exception{
	FileInputStream fs = new FileInputStream("C:\\Users\\RAJAT\\workspace\\MVN_Selenium\\src\\main\\java\\genericlibrary\\config.properties");
	Properties props = new Properties();
	props.load(fs);
	
	return(props.getProperty(key));
	}
}
