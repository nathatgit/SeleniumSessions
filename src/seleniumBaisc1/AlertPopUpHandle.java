package seleniumBaisc1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertPopUpHandle {

	WebDriver FF = null;

	@BeforeTest
	public void Setup() {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\drivers\\chromedriver.exe");
		FF = new ChromeDriver();
		FF.manage().window().maximize();
		FF.manage().deleteAllCookies();
		FF.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test
	public void AlertPopUpTest() {
		FF.get("https://mail.rediff.com/cgi-bin/login.cgi");

		FF.findElement(By.name("proceed")).click();

		Alert Al = FF.switchTo().alert();

		String AlertText = Al.getText();

		System.out.println(AlertText);

		if (AlertText.equals("Please enter a valid user name")) {
			System.out.println("Test Passed Sucessfully");
		} else {
			System.out.println("Test Failed");
		}

		Al.accept();

	}

	@Test
	public void SwtichtoDefault() {
		FF.switchTo().defaultContent();

		String DefauContent = FF.findElement(By.xpath(" //u[contains(text(),'Create a new account')]")).getText();

		System.out.println(DefauContent);
	}

	@Test
	public void UploadbtnTest() throws InterruptedException {
		FF.get("https://demo.guru99.com/test/upload/");
		Thread.sleep(4000);
		// WebElement we = FF.findElement(By.name("uploadfile_0"));

		// we.sendKeys("‪C:\\New\\Ex.html");

		FF.findElement(By.name("uploadfile_0")).sendKeys("‪C:\\New\\Ex.html");

		FF.findElement(By.id("terms")).click();

		FF.findElement(By.id("submitbutton")).click();

		Thread.sleep(2000);
	}

	@AfterTest
	public void setDown() {
		FF.quit();
		System.out.println("Test Completed");
	}

}
