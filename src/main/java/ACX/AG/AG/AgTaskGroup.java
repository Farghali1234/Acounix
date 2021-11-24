package ACX.AG.AG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AgTaskGroup {

private static List<WebElement> elements = null;
	
	public void AgTaskGroupConnectionSteps(WebDriver driver) {
		
		WebElement WFTaskGroupButton=returnOneElement(driver ,"//button[@class='btn add-workflow']" ,"Add Task Group");
		WFTaskGroupButton.click();
		
		
		//Node Type
		WebElement Node1= driver.findElement(By.cssSelector("td.name:nth-child(1) > select:nth-child(1)"));
	    Select select1 = new Select(Node1);
		select1.selectByIndex(1);	
		
		//Node Name:
		WebElement Node2= driver.findElement(By.cssSelector("td.start-time:nth-child(2) > select:nth-child(1)"));
	    Select select2 = new Select(Node2);
		select2.selectByIndex(1);
		
		//Task:
		WebElement Node3= driver.findElement(By.cssSelector(".end-time > select:nth-child(1)"));
	    Select select3 = new Select(Node3);
		select3.selectByIndex(1);
		
		//Response Parameter:
		WebElement Node4= driver.findElement(By.cssSelector(".created-by > select:nth-child(1)"));
	    Select select4 = new Select(Node4);
		select4.selectByIndex(1);
		
		//Response Value:
		WebElement Node5= driver.findElement(By.cssSelector(".status > select:nth-child(1)"));
	    Select select5 = new Select(Node5);
		select5.selectByIndex(0);
		
		
	}
	
	
	public static WebElement returnOneElement (WebDriver driver,String path,String text){
	    elements = driver.findElements(By.xpath(path));
	    for (WebElement element : elements){
	        String myText = element.getText();
	        if (myText.contains(text)) {
	            return element;
	        }
	    }
	    return null;
	}

	
}
