package openit;

import org.openqa.selenium.WebDriver;


import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class OpenIt {

	/*public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://altoconvertpdftojpg.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("browse")).click();
		
		Thread.sleep(3000);
		Runtime.getRuntime().exec("E:\\oploadFile.exe");
		Thread.sleep(3000);
		WebElement convert=driver.findElement(By.xpath("//button[@id='submit_btn']"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",convert);
		convert.click();*/
	
	@Test
	public void  testinGNG() throws InterruptedException
	{
	// Instantiate WebDriver 
	WebDriver driver=new ChromeDriver();
	
	//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
	//open url
	driver.get("https://www.guvi.in/");
	
	//Maximize screen
	driver.manage().window().maximize();
	
	//find  x-path the Element to click
	driver.findElement(By.xpath("//a[.='Sign up']")).click();
	
	//Send the name to  name -text box
	driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Rajhen");
	
	//Send the Email to  email text box
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("raswanthrajen@gmail.com");
	
	//Send the Password to  password text box
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password@123");
	

	//Send the mobile number to  mobile number text box
	driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("7010816015");
	
	//Thread		
	Thread.sleep(2000);
	//click sign up button
	driver.findElement(By.xpath("//a[@id='signup-btn']")).click();
	 
	
	
	WebElement profile=driver.findElement(By.xpath("//select[@id='profileDrpDwn']"));
	
	// dropdown functions
    Select dropdown = new Select(profile);
	
    dropdown.selectByVisibleText("Working professional in IT");
	}
			
		
	}
	


