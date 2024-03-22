package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalDetails_Pom_Class {

	@FindBy (xpath = "//img[@alt='edit personal details']")
	private WebElement pe;

	public PersonalDetails_Pom_Class(WebDriver driver) {
	  PageFactory.initElements(driver,this);
	}

	public WebElement getPe() {
		return pe;
	}
	
	public void PersonaldetailsOperation()
	{
		pe.click();
	}
}
