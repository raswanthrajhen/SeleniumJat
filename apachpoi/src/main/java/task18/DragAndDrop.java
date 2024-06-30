package task18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DragAndDrop {

	public static void main(String[] args) {
		// Instantiate WebDriver
		WebDriver driver=new ChromeDriver();
		
		//implement implicitly wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//open Website
		driver.get("https://jqueryui.com/droppable/");
		
		//Find the Frame and Get the frame Web element
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		//Change Frame
		driver.switchTo().frame(frame);
		
		//Find the Web element of drag
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		
		//Find the Web element of drop
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		//Create object for Action class  
		Actions action=new Actions(driver);
		
		//perform the drag and drop 
		action.dragAndDrop(drag, drop).perform();
		
		
	}

}
