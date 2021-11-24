package ACX.AG.AG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AGAutmation {

	 
	public static void main(String[] args) {		
		
		//basic Setup:
		BasicsSetup s =new BasicsSetup();
		WebDriver driver=s.SetUp();
		
		//Open System URL
		driver.get("https://192.168.1.175/axcelios/#/signin");
		
		//Login:
		SysLogin Slogin=new SysLogin();
		Slogin.login(driver);

		//Add a New AirGap 
		AddNewAG AddNewAG1=new AddNewAG();
		AddNewAG1.AddNewAGM(driver);		
		
	}
}
