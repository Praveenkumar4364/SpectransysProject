package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdatePreferences_Pom_Class {
 @FindBy (xpath = "//button[text()='Update Preferences']")
 private WebElement up;
 
 @FindBy (xpath = "(//div[@class='preferenceunchecked '])[1]")
 private WebElement se;
 
 @FindBy (xpath = "//button[@class='absolute top-2 right-2 h-6 w-6']")
 private WebElement cancel;

public UpdatePreferences_Pom_Class(WebDriver driver) {
	
	PageFactory.initElements(driver,this);
}

public WebElement getUp() {
	return up;
}

public WebElement getSe() {
	return se;
}

public WebElement getCancel() {
	return cancel;
}
 
 public void updatepreferencesOperations()
 {
	 up.click();
	 se.click();
	 cancel.click();
 }
}
