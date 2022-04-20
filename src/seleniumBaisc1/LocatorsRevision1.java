package seleniumBaisc1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LocatorsRevision1 {

	public static void main(String[] args) {

		UserPref up = new UserPref();
		WebDriver FF = up.Wb();

		FF.get("https://signup.ebay.com/pa/crte?");
		// FF.findElement(By.linkText("register")).click();

		FF.findElement(By.id("firstname")).sendKeys("FirstName");

		FF.findElement(By.id("lastname")).sendKeys("LastName");

		FF.findElement(By.id("Email")).sendKeys("email@gmail.com");

		FF.findElement(By.id("password")).sendKeys("Pass@..21");

		FF.findElement(By.id("EMAIL_REG_FORM_SUBMIT")).click();

		FF.quit();

	}

}
