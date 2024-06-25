package task15;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;  

public class OpenGoogle {
	
	public static void main(String[] args) throws InterruptedException {
		         
        // Instantiate a ChromeDriver class.     
		 WebDriver driver=new ChromeDriver(); 
		 
		 //  Load the url
		 driver.get("https://www.google.com/");
		 
		 //Maximize the Browser

		 driver.manage().window().maximize();
		 
		 //implicity wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.findElement(By.name("q")).sendKeys("Selenium Browser Driver");
	     driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).click();
	 
	     Thread.sleep(6000);
	     driver.close();
		 
	}

}
