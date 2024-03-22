package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_Pom_Class {
@FindBy (xpath = "//div[contains(@class,'  flex flex')]/div[2]")
private WebElement logout1; 

@FindBy (xpath = "//h5[text()=' Sign Out']")
private WebElement logout2;

public Logout_Pom_Class(WebDriver driver) {
PageFactory.initElements(driver,this);
}

public WebElement getLogout1() {
	return logout1;
}

public WebElement getLogout2() {
	return logout2;
}
public void logoutOperation()
{
	logout1.click();
	logout2.click();
}
}
