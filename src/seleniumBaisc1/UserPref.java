package seleniumBaisc1;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UserPref {
	
   public WebDriver Wb()
	{
	WebDriver FF;
	Scanner sc = new Scanner(System.in);
	System.out.println("Chrome or Firefox ??");
	String driver = sc.nextLine();
	sc.close();
	
	if(driver.equals("Firefox"))
	{
	
	System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\drivers\\geckodriver.exe");
	FF = new FirefoxDriver();
	FF.manage().window().maximize();
	FF.manage().deleteAllCookies();
	FF.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	
	else{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\drivers\\chromedriver.exe");
		
		FF = new ChromeDriver();
		FF.manage().window().maximize();
		FF.manage().deleteAllCookies();
		FF.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	return FF;
	}
	
}
