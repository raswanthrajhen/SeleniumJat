package task19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guvi {

	public static void main(String[] args) {
		
		//Instantiate Web Driver 
		WebDriver driver=new ChromeDriver();
		
		//Open Url
		driver.get("https://www.guvi.in/register/");
		
		//Enter the Name of person
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Raswanth");
		
		//Enter the email address
		driver.findElement(By.id("email")).sendKeys("raswanthrajen@gmail.com");
		
		//Enter the password
		driver.findElement(By.cssSelector("#password")).sendKeys("Abcd123@");
		
		//Enter the phone number
		driver.findElement(By.id("mobileNumber")).sendKeys("8220722145");
		
		//Click Singup Button
		driver.findElement(By.xpath("//a[@id='signup-btn']")).click();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Enter the Year
		driver.findElement(By.xpath("//input[@id='year']")).sendKeys("1996");
	}

}
