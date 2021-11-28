package ACX.AG.AG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicsSetup {
	
	public BasicsSetup() {
	}
	
	public WebDriver SetUp()
	{
		//Setup
		//WebDriverManager.chromedriver().setup(); //.version("77.0.3865.40").setup();
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
