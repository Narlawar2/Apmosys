import static org.testng.Assert.expectThrows;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.redbus.com/es-419/?lang_changed=true");
	
		
		//driver.findElement(By.linkText("Accept All")).click();
		//driver.findElement(By.partialLinkText("Accept")).click();
		//driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//*[text()=\"Accept All\"]")).click();
		//driver.findElement(By.xpath("(//div[@class=\"icon-down icon ich dib\"])[2]")).click();
		//Thread.sleep(3000);
	
		//act.moveToElement(driver.findElement(By.xpath("//*[text()=\"Espanol\"]"))).build().perform();
		//driver.findElement(By.xpath("//li[@data-label=\"Espanol\"]")).click();
		//Thread.sleep(2000);
		// driver.findElement(By.xpath("(//*[@class=\"icon-down icon ich dib\"])[1]")).click();
		//driver.findElement(By.xpath("//li[@data-currency=\"EUR\"]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@class=\"icon-down icon ich dib mbh\"]")).click();
	//	driver.findElement(By.xpath("//li[@data-label=\"Show My Ticket\"]")).click();
		
		driver.findElement(By.xpath("//input[@id=\'src\']")).sendKeys("mumbai");
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.id("dest")).sendKeys("Nagpur");
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//input[@id=\"onward_cal\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()=\"23\"])[1]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.id("id=\"r-date\"")).click();
		driver.findElement(By.xpath("//*[@id=\"r-date\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//*[text()=\"25\"])[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class=\"search-lbl\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//*[@for=\"dt12 pm to 6 pm\"])[1]")).click();
        Thread.sleep(2000);
        
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)", args);
        
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//*[@for=\"bt_AC\"])[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//*[@for=\"bt_Single Seats\"])[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//*[@for=\"at6 am to 12 pm\"])[1]")).click();
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,600)",args);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@placeholder=\"BOARDING POINT\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@name=\"inpFilter\"]")).sendKeys("j");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//*[@for=\"bp_Jogeshwari East\"])[1]")).click();
        Thread.sleep(2000);
       //.executeScript("window.scrollBy(0,700)",args);
        driver.findElement(By.xpath("//*[@class=\"button btn-apply bp-apply\"]")).click();
        Thread.sleep(3000);
        act.sendKeys(Keys.PAGE_DOWN).build().perform();
           Thread.sleep(3000); 
         driver.findElement(By.xpath("//*[@placeholder=\"DROPPING POINT\"]")).click();
         driver.findElement(By.xpath("//*[@name=\"inpFilter\"]")).sendKeys("dharam");
         driver.findElement(By.xpath("(//*[@for=\"dp_Dharampeth\"])[1]")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("//*[text()=\"APPLY\"]")).click();
         Thread.sleep(3000);
         act.sendKeys(Keys.PAGE_DOWN).build().perform();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//*[@placeholder=\"OPERATOR\"]")).click();
         Thread.sleep(2000);
         driver.findElement(By.name("inpFilter")).sendKeys("maha");
         Thread.sleep(3000);
         driver.findElement(By.xpath("//*[text()=\"APPLY\"]")).click();
         act.sendKeys(Keys.PAGE_DOWN).build().perform();
         
         
         
         
         
         
         

        		
        
        
        
        
        
     
        
        
        
		
		
		
		
		
		

	}

}
