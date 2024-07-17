package openit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
public class SnapDeal {

	@Test
	public  void snap() throws InterruptedException {
		// Instantiate WebDriver
		WebDriver driver=new ChromeDriver();
		
		//open snapdeal Website
		driver.get("https://snapdeal.com/");
		
		//implcit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement signInButton=driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
		
		//Create the object for Action Class
		Actions actions = new Actions(driver);

	     // Perform click and hold, move to another element, and release
	    actions.clickAndHold(signInButton)
	               .release()
	               .perform();
	    
	    //Thread Sleep is used for pop up message 
	    Thread.sleep(6000);
	  
	   	 // Enter into the account
	     driver.findElement(By.xpath("//a[normalize-space()='Your Account']")).click();
	     
	     //Enter the user number
	     driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("8220722145");
	     
	     //Click the continue button
	     driver.findElement(By.xpath("//button[@id='checkUser']")).click();
	     
	     // Enter the OTP
	     Thread.sleep(20000);
	     driver.findElement(By.xpath("//button[@id='loginUsingOtp']")).click();
	     
	     WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10)); // 10 seconds timeout

         // Wait until the span element is visible
	     WebElement spanElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class, 'accountUserName')]")));

         // Get the text of the span element
         String spanText = spanElement.getText();

         // Print the text of the span element
         System.out.println(" Successfull enter into WebSite , The UserName " + spanText);
	}

}
