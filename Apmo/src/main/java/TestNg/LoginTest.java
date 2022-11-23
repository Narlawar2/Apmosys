package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class LoginTest {
	WebDriver driver;

	@Parameters({"browser"})
	@Test
	public void launch(String browser) {
		System.out.println("Running browser is:"+browser);

		if(browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();

		}else if(browser.equals("Firefox")) {
			driver=new FirefoxDriver();

		}
		driver.get("http://www.freecrm.com v");

	}
}
