package genericlibraryforsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import Object_Repository.Login_Pom_Class;
import Object_Repository.Logout_Pom_Class;

public class Base_Class {
	PropertiesUtility PUTIL=new PropertiesUtility();
   public static ExcelUtility EUTIL=new ExcelUtility();
	public WebDriver driver;
@BeforeSuite(alwaysRun=true)
public void createDbConnection()
{
	System.out.println("Db connection successful");
}
@BeforeClass(alwaysRun=true)
public void launchbrowser() throws Exception
{
	String URL=PUTIL.getdatafromProperties("url");
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	System.setProperty("webdriver.chrome.driver","D:\\Selenium Folder\\chromedriver.exe");
	driver=new ChromeDriver(option);
	driver.get(URL);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	System.out.println("browser launched successfully");
}
@BeforeMethod(alwaysRun=true)
public void loginApp() throws Exception
{
	String USERNAME=PUTIL.getdatafromProperties("email");
	String PASSWORD=PUTIL.getdatafromProperties("password");
	Login_Pom_Class l=new Login_Pom_Class(driver);
	l.loginOperation(USERNAME, PASSWORD);
//	driver.findElement(By.xpath("//a[contains(@class,' xxs:px-2')]")).click();
//	driver.findElement(By.xpath("//h6[text()='Sign In With Email']")).click();
//	driver.findElement(By.xpath("//input[@placeholder='Enter Your Registered  Email']"))
//	            .sendKeys(USERNAME,Keys.TAB,PASSWORD,Keys.ENTER);
	System.out.println("login successfull");
	
}
@AfterMethod(alwaysRun=true)
public void logout()
{
//	driver.findElement(By.xpath("//div[contains(@class,'  flex flex-row')]/div[2]")).click();
//	driver.findElement(By.xpath("//h5[text()=' Sign Out']")).click();
	Logout_Pom_Class lg=new Logout_Pom_Class(driver);
	lg.logoutOperation();
	System.out.println("logout successfully");
}
@AfterClass(alwaysRun=true)
public void closewindow()
{
	driver.close();
	System.out.println("browser closed successfully");
}
@AfterSuite(alwaysRun=true)
public void closeDbconnection()
{
	System.out.println("Db connection closed successfully");
}
}
