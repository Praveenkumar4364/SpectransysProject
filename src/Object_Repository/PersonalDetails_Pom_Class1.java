package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalDetails_Pom_Class1 {

	@FindBy (xpath = "//textarea[@class='edit-input font-semibold']")
	private WebElement about;

	public PersonalDetails_Pom_Class1(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getAbout() {
		return about;
	}
	public void editOperation(String data)
	{
		this.about.sendKeys(data);
	}
	
}
