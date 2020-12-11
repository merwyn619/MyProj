package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMLoginpage {

	WebDriver driver;
	
	public RMLoginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By signin=By.cssSelector("[title*='Sign in']");
	By email=By.cssSelector("#useremail");
	By pwd=By.cssSelector("#userpass");
	//By submit=By.cssSelector("#loginsubmit");
	By rm=By.cssSelector("[class*='curhand']");
	By trends=By.cssSelector("[href*='indicators']");
	By marketNews=By.xpath("//*[@class='ul_top_tabs']/li[5]/a");
	
	
	public WebElement signin()
	{
		return driver.findElement(signin);
	}
	public WebElement email()
	{
		return driver.findElement(email);
	}
	public WebElement pwd()
	{
		return driver.findElement(pwd);
	}
	/*public WebElement submit()
	{
		return driver.findElement(submit);
	}*/
	public WebElement rm()
	{
		return driver.findElement(rm);
	}
	public WebElement trends()
	{
		return driver.findElement(trends);
	}
	public WebElement marketNews()
	{
		return driver.findElement(marketNews);
	}
}
