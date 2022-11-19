import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtendReport {
	
@Test
public void login(){
	ExtentReports ex=new ExtentReports();
	
	ExtentSparkReporter sp= new ExtentSparkReporter("target/prashant.html");
	
	sp.config().setReportName("fecebook");
	sp.config().setDocumentTitle("login function"); 
	sp.config().setTheme(Theme.DARK);
	ex.attachReporter(sp);
	
	ExtentTest test=ex.createTest("login test");
	
	test.log(Status.PASS, "star login test");
	test.log(Status.PASS, "go to url");
	test.log(Status.PASS, "enterd username");
	test.log(Status.PASS, "enterd password");
	test.log(Status.FAIL, "click on submit button");
	test.log(Status.INFO, "end login test");
	ex.flush();
	
	
	
	
}
	}


