package genericlibraryforsp;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * This is generic class for properties
 * @author praveen
 */
public class PropertiesUtility {
/**
 * This is a generic method for read data from properties
 * @param
 * @return
 * @throws Exception 
 * @throwsException
 */
	public String getdatafromProperties(String data) throws Exception
	{
		FileInputStream fis=new FileInputStream(IconstantUtility.PropertiesPath);
		Properties pobj=new Properties();
		pobj.load(fis);
		String DATA=pobj.getProperty(data);
		return DATA;
	}
}
