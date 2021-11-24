package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	
	WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public LoginPage(WebDriver driver) {
          this.driver = driver;
	}
	
	//Locator for username field
	By uName = By.xpath("//input[@id=\"name\"]");
	
	//Locator for password field
	By pswd = By.xpath("//input[@id='password']");
	
	//Locator for login button
	By loginBtn = By.xpath("//button[@class='btn w-100 text-white mt-3']");
	
	
	//Method to enter username
	public void enterUsername(String user) {
		driver.findElement(uName).clear();
		driver.findElement(uName).sendKeys(user);
	}

	//Method to enter password
	public void enterPassword(String pass) {
		driver.findElement(pswd).clear();
		driver.findElement(pswd).sendKeys(pass);
	}
	
	//Method to click on Login button
	public void clickLogin() {
		driver.findElement(loginBtn).click();
	}
	

}
