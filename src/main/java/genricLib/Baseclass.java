package genricLib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public WebDriver driver;
	public Propertyfille pdata=new Propertyfille();
	public WebDriverUtilies driverutilies= new WebDriverUtilies();
	@BeforeMethod
	public void openApp() throws IOException
	{
		WebDriverManager.chromedriver().setup();//firefoxdriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.getPropertyfile("url")); 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
		@AfterMethod
		public void closeApp( ITestResult res) throws IOException
		{
			int status = res.getStatus();
			String name = res.getName();
			
			if(status==2)
			{
				Screenshot s=new Screenshot();
				s.getPhoto(driver, name);
			}
			driver.quit();
		}
}	
			
			