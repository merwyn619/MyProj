package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RMTrendspage {

	WebDriver driver;
	public RMTrendspage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	/*By search=By.cssSelector("#srchword");
	By submit=By.cssSelector("[class*='btn_srch']");*/
	
	@FindBy(name="srchword")
	WebElement search;	
	
	@FindBy(xpath="//*[@type='submit']")
	WebElement submit;
		
	public WebElement search()
	{
		return search;
	}
	public WebElement submit()
	{
		return submit;
	}
	
}
