package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Pom_Class {
@FindBy (xpath="//input[@placeholder='Enter Your Registered  Email']")
private WebElement email;

@FindBy (xpath="//input[@placeholder='Enter Your Password']")
private WebElement password;

@FindBy (xpath = "//a[text()='Sign in']")
private WebElement signin1;

@FindBy(xpath = "//h6[text()='Sign In With Email']")
private WebElement signin2;

@FindBy (xpath="//button[text()='Sign In']")
private WebElement login;

public Login_Pom_Class(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public WebElement getEmail() {
	return email;
}

public WebElement getPassword() {
	return password;
}

public WebElement getSignin1() {
	return signin1;
}

public WebElement getSignin2() {
	return signin2;
}

public WebElement getLogin() {
	return login;
}
public void loginOperation(String email,String password)
{
	this.signin1.click();
	this.signin2.click();
	this.email.sendKeys(email);
	this.password.sendKeys(password);
	this.login.click();
}
}
