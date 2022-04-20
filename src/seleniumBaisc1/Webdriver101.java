package seleniumBaisc1;

import org.openqa.selenium.WebDriver;


public class Webdriver101 {

	public static void main(String[] args) {

		UserPref up = new UserPref();
		WebDriver FF = up.Wb();

		FF.get("https://www.google.com");

		String str = FF.getTitle(); // Geting Test Data
		System.out.println(str); // Printing Test Data

		if (str.equals("Google")) { // Validation Point
			System.out.println("--------TestPassed---------");
		} else {
			System.out.println("---------TestFailed---------");
		}

		FF.quit();

	}
}
