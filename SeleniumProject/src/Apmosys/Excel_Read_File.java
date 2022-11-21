package Apmosys;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_Read_File {

		public static void main(String[] args) throws InterruptedException {
			
		    System.setProperty("Webdriver.Chrome.Driver", "Chrome.driver.exe");
		      WebDriver driver= new ChromeDriver();
		       
		      abc configer= new abc("C:\\Users\\Prashant\\Desktop\\readexelfile.xlsx");
		      int a=0;
		      int row=configer.getrowcount(a);
		      String Username,Password;
		      for(int i=0;i<=row;i++)
		      {
		    	  
		    	  Username=configer.get_data(0, i, 0);
		    	  Password=configer.get_data(0,i,1);
		    	  
		    	    driver=new ChromeDriver();
		    	    driver.manage().window().maximize();
			        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			        Thread.sleep(5000);
			        driver.get(" http://mail.apmosys.com/ ");
			        Thread.sleep(5000);
			        driver.findElement(By.name("email-address")).sendKeys(Username);
			        System.out.println("username :-- " + Username);
			        
			        
			        Thread.sleep(6000);
			        driver.findElement(By.name("next")).click();
			        Thread.sleep(6000);
			        driver.findElement(By.name("password")).sendKeys(Password);
			        
			        System.out.println("Password :-- " + Password);

			        driver.findElement(By.name("next")).click();
			        Thread.sleep(6000);
			        String s= driver.getTitle();
			        System.out.println(s);
			        System.out.println("Data read from excel");
			        Thread.sleep(5000);
			         driver.quit();
		      }
		      
	}

}

