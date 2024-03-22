package Object_Repository;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page_Pom {
@FindBy (xpath = "//h3[text()='Achievements']")
private WebElement achievements;

@FindBy (xpath="//a[text()='Learnings']")
private WebElement learnings;

@FindBy (xpath="//a[text()='Opportunities']")
private WebElement opportunities;

@FindBy (xpath = "//a[text()='Book Your Trainings']")
private WebElement booktrainings;

public Home_Page_Pom(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public WebElement getAchievements() {
	return achievements;
}

public WebElement getLearnings() {
	return learnings;
}

public WebElement getOpportunities() {
	return opportunities;
}

public WebElement getBooktrainings() {
	return booktrainings;
}

//public void achievementsoperation()
//{
//	List<WebElement> element=driver.findElements(By.xpath("//div[contains(@class,'col-span-1 grid')]"));
//	Actions act=new Actions(driver);
//	Iterator<WebElement> itr=element.iterator();
//	while(itr.hasNext())
//	{
//		WebElement img=itr.next();
//		act.moveToElement(img).perform();
//		Thread.sleep(3000);
//	}
//}

public void learningsoperation()
{
	this.learnings.click();
}

public void opportunitiesoperation()
{
	this.opportunities.click();
}

public void booktrainingsoperation()
{
	this.booktrainings.click();
}

}
