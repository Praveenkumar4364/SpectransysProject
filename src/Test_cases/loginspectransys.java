package Test_cases;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Object_Repository.Home_Page_Pom;
import Object_Repository.PersonalDetails_Pom_Class;
import Object_Repository.PersonalDetails_Pom_Class1;
import Object_Repository.Profile_Pom_Class;
import Object_Repository.UpdatePreferences_Pom_Class;
import genericlibraryforsp.Base_Class;

public class loginspectransys extends Base_Class{
	@Test                                       
public void login() throws Exception      
{
		List<WebElement> element=driver.findElements(By.xpath("//div[contains(@class,'col-span-1 grid')]"));
		Actions act=new Actions(driver);
		Iterator<WebElement> itr=element.iterator();
		while(itr.hasNext())
		{
			WebElement img=itr.next();
			act.moveToElement(img).perform();
			Thread.sleep(3000);
		}
		UpdatePreferences_Pom_Class u=new UpdatePreferences_Pom_Class(driver);
		u.updatepreferencesOperations();
		Thread.sleep(3000);
		Profile_Pom_Class p=new Profile_Pom_Class(driver);
		p.profileOperation();
		Thread.sleep(3000);
		PersonalDetails_Pom_Class pd=new PersonalDetails_Pom_Class(driver);
		pd.PersonaldetailsOperation();
		Thread.sleep(3000);
		PersonalDetails_Pom_Class1 pe=new PersonalDetails_Pom_Class1(driver);
	    String data=EUTIL.getDatafromExcel("PersonalDetails",3,0);
	    pe.editOperation(data);
		//driver.findElement(By.xpath("//button[text()='Update Preferences']")).click();
		Home_Page_Pom hp=new Home_Page_Pom(driver);
		hp.learningsoperation();
		Thread.sleep(3000);
		hp.booktrainingsoperation();
		Thread.sleep(3000);
		hp.opportunitiesoperation();
		
		
}
}
