package PageObjectModel;

import javax.security.auth.spi.LoginModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	loginpage page=new loginpage(driver);
	driver.get("https://mail.apmosys.com/webmail/#sign-in");
	Thread.sleep(2000);
page.enterusername("prashant.narlawar@apmosys.com");
page.clickonnext();
Thread.sleep(2000);
page.enterpassword("Shine@123");
page.Signbutton();
	
}
}
