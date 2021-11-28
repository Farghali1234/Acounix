package ACX.AG.AG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AgCloseConnection {
	
	
	public void AgCloseConnectionSteps(WebDriver driver) {
		
		WebElement WFAirgapCloseButton= driver.findElement(By.xpath("//button[@class='btn add-workflow mx-2']"));
		WFAirgapCloseButton.click();		
		
		//Node Type
		WebElement Node1= driver.findElement(By.cssSelector(".node-type > select:nth-child(1)"));
	    Select select1 = new Select(Node1);
		select1.selectByIndex(1);	
		
		//Node Name:
		WebElement Node2= driver.findElement(By.cssSelector(".node > select:nth-child(1)"));
	    Select select2 = new Select(Node2);
		select2.selectByIndex(1);
		
		//Task:
		WebElement Node3= driver.findElement(By.cssSelector(".table-close-connection > div:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(5) > select:nth-child(1)"));
	    Select select3 = new Select(Node3);
		select3.selectByIndex(1);
		
		//Response Parameter:
		WebElement Node4= driver.findElement(By.cssSelector(".table-close-connection > div:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(6) > select:nth-child(1)"));
	    Select select4 = new Select(Node4);
		select4.selectByIndex(1);
		
		//Response Value:
		WebElement Node5= driver.findElement(By.cssSelector(".table-close-connection > div:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(7) > select:nth-child(1)"));
	    Select select5 = new Select(Node5);
		select5.selectByIndex(0);
				
		
	}
	
}

