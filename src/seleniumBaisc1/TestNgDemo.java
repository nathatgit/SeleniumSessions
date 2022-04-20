package seleniumBaisc1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class TestNgDemo {
	 WebDriver FF = null;
	 
	 
	@BeforeTest
	public void Setup() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\drivers\\geckodriver.exe");
		FF = new FirefoxDriver();
		FF.manage().window().maximize();
		FF.manage().deleteAllCookies();
		FF.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@Test
	public void googleSearch()
	{
		FF.get("https://www.google.com");
		
		String str = FF.getTitle();
		
		if(str.equals("Google"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
				
	}
	
	@AfterTest
	public void setDown()
	{
		FF.quit();
		System.out.println("Test Completed");
	}
	
	

}



