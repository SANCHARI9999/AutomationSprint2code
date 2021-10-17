package hook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks1 {
	public static WebDriver driver;
	@Before
	public void init()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Documents\\CAPG WORKSPACE\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	@After
	public void unit()
	{
		driver.quit();
	}
	
	



}
