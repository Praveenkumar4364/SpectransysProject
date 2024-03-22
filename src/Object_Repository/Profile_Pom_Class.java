package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile_Pom_Class {
@FindBy (xpath = "//p[text()='Complete Your Profile Now >>']")
private WebElement pi;

public Profile_Pom_Class(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public WebElement getPi() {
	return pi;
}

public void profileOperation()
{
	pi.click();
}
}
