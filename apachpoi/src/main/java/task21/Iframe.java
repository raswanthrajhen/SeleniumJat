package task21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Iframe {

	public static void main(String[] args) {
		// Instantiate Driver
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Maximize the window
		driver.manage().window().maximize();
		
		//
		WebElement frameOne=driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
		
		driver.switchTo().frame(frameOne);
		
		driver.findElement(By.xpath("//p[.='Your content goes here.']")).sendKeys("raswanth");
		
	}

}
