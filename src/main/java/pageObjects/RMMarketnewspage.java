package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMMarketnewspage {

	WebDriver driver;
	
	public RMMarketnewspage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By search=By.cssSelector("#srchword");
	By showMore=By.cssSelector("[onclick*='MoreNews']");
		
	public WebElement search()
	{
		return driver.findElement(search);
	}
	public WebElement showMore()
	{
		return driver.findElement(showMore);
	}
	
}
