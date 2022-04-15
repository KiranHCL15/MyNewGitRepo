package MicrosoftAzure_demo.MicrosoftAzure_demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class AppTest 
    
{
	WebDriver driver=null;
//    @Parameters("browser")
	@Test
	public void test(String browser)
	{
//		if(browser.equals("chrome")){
//		
//		WebDriverManager.chromedriver().setup();
//		 driver=new ChromeDriver();
//		}
//		else if(browser.equals("firefox")){
//			WebDriverManager.firefoxdriver().setup();
//			 driver=new FirefoxDriver();
//		}
    	WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	}
}
