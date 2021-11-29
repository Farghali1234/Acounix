package ACX.AG.AG;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ReadData;

public class BasicsSetup {
	
	public BasicsSetup() throws IOException {
		ReadData readData=new ReadData();
		readData.Read();
	}
	
	public WebDriver SetUp()
	{
		//Setup
		WebDriverManager.firefoxdriver().setup(); 
		FirefoxOptions options = new FirefoxOptions (); 
		WebDriver driver =new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		return driver;
	}
	
}
