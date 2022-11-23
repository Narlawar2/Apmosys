import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActitimeSitePrintExcelSheet {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
           WebDriverManager.chromedriver().setup();
           WebDriver driver=new ChromeDriver();
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
           
           //FileInputStream
           File f=new File("C:\\Users\\Prashant\\Desktop\\ac.xlsx");
           FileInputStream fis= new FileInputStream(f);
          
           XSSFWorkbook wb= new XSSFWorkbook(fis);
           
           XSSFSheet Sheet = wb.getSheet("abc");
           
           driver.get("https://demo.actitime.com/login.do");
           driver.findElement(By.id("username")).sendKeys("admin");
           driver.findElement(By.name("pwd")).sendKeys("manager");
           Thread.sleep(2000);
           driver.findElement(By.id("loginButton")).click();
           Thread.sleep(3000);
           driver.findElement(By.xpath("(//*[text()='Lock Time-Track'])[1]")).click();
           
           WebElement t= driver.findElement(By.xpath("//*[@id=\'pageContent\']/table"));
       WebElement td=t.findElement(By.tagName("tbody"));
        
       List<WebElement> row=td.findElements(By.tagName("tr"));
       for(int i=0;i<row.size();i++) {
    	   
    	   Row r=Sheet.createRow(i+1);
    	   List<WebElement>col=row.get(i).findElements(By.tagName("td"));
    	   
    	   for(int j=0;j<col.size();j++) {
    		   
    		   Cell cl=r.createCell(j);
    		   cl.setCellValue(col.get(j).getText());
    		   System.out.println(col.get(j).getText()+" ");
    	   }
    	   System.out.print(" ");
    	   
       }
       
       fis.close();
       FileOutputStream out = new FileOutputStream(f);
       out.close();
       wb.close();
       driver.close();
       
       
            
           
           
           
           
           
	}

}
