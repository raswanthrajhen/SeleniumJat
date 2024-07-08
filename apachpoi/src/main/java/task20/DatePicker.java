package task20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		// Instantiate Web-Driver
		WebDriver driver=new ChromeDriver();
		
		//open url
		driver.get("https://jqueryui.com/datepicker/");
		
		//Maximize screen
		driver.manage().window().maximize();
		
		//FInd the I-frame
		WebElement frameOne=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		//Switch to next frame
		driver.switchTo().frame(frameOne);
		
		//implicit wait implementation
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//find the date picker element
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		//click the date picker element
		driver.findElement(By.xpath("//a[@data-handler='next']")).click();
		
		//select date '22' click
		driver.findElement(By.xpath("//a[@data-date='22']")).click();
		
		WebElement data=driver.findElement(By.xpath("//input[@id='datepicker']"));
			
		//Get the date
		String date=data.getAttribute("value");
	
		//Sleep
		Thread.sleep(5000);
		
		//close the driver
		driver.close();
		
		//print the date
		System.out.print(date);
		
		
		}

	
}

/* Output of program
 * 
 * 08/22/2024
 * 
 * Screenshot Attached in google doc 
 * */
	


