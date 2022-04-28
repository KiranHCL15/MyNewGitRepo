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
   @Parameters("browser")
	@Test(priority=2)
	public void test1(String browser) throws InterruptedException
	{
		if(browser.equals("chrome")){
			System.out.println("chrome test started");
		System.out.println("started chrome browser");
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://www.google.co.in/");
	
		 Thread.sleep(2000);
		 driver.close();
			System.out.println("ended chrome browser");
		}
		else if(browser.equals("firefox")){
			System.out.println("started firefox browser");
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
			
			 driver.get("https://www.google.co.in/");
			 Thread.sleep(2000);
			 driver.close();
				System.out.println("ended firefox browser");
		}
//    	WebDriverManager.chromedriver().setup();
//		 driver=new ChromeDriver();
	}
	@Test(priority=1)
	public void test()
	{
		System.out.println("hii i m printing this statements");
	}
}
