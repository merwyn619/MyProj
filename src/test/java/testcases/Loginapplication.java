package testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import objectrepository.RMLoginpage;
import objectrepository.RMMarketnewspage;
import objectrepository.RMTrendspage;
import resources.Base;

public class Loginapplication extends Base {

	public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
	}
	
	@Test
	public void login() throws InterruptedException, IOException
	{
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		RMLoginpage rl=new RMLoginpage(driver);
		rl.signin().click();
		rl.email().sendKeys("merwyn@abc.com");
		rl.pwd().sendKeys("123456");
		//rl.submit().click();
		rl.rm().click();
		rl.trends().click();
		RMTrendspage rt=new RMTrendspage(driver);
		rt.search().sendKeys("Tata");
		rt.submit().click();
		rl.rm().click();
		rl.marketNews().click();
		RMMarketnewspage rm=new RMMarketnewspage(driver);
		//rm.search().sendKeys("Axis");
		rm.showMore().click();
		rl.rm().click();
		System.out.println(driver.getTitle());
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
