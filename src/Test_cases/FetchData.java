package Test_cases;

import java.io.FileInputStream;

import java.util.Properties;

public class FetchData {
public static void main(String[] args) throws Exception {
	FileInputStream fis=new FileInputStream("D:\\Selenium Folder\\Spectransys.properties");
	Properties pobj=new Properties();
	pobj.load(fis);
	String URL=pobj.getProperty("url");
	String UN=pobj.getProperty("email");
	String PWD=pobj.getProperty("password");
	System.out.println(URL);
	System.out.println(UN);
	System.out.println(PWD);
}
}
