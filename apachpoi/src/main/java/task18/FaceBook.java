package task18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FaceBook {

	public static void main(String[] args) {
		// Instantiate WebDriver
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		// Click Create Account
         WebElement createAccountButton = wait.until(
            ExpectedConditions.elementToBeClickable(By.xpath("(//a[.='Create new account'])[1]")) 
            
        );
        createAccountButton.click();
        
        //Enter the first name
        driver.findElement(By.xpath("(//input[@aria-label='First name'])")).sendKeys("Raswanth");
        
        //Enter surname 
        driver.findElement(By.xpath("//input[contains(@aria-label,'Surname')]")).sendKeys("rajhen");
        //Enter email 
        driver.findElement(By.name("reg_email__")).sendKeys("raswnathrajen@gmail.com");
        //ReEnter email 
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("raswnathrajen@gmail.com");
        //Enter Password 
        driver.findElement(By.xpath("//input[contains(@aria-label,'New password')]")).sendKeys("Apj@123");
		//Enter the BirthDay
        driver.findElement(By.xpath("//select[@id='day']")).sendKeys("26");
		//Enter birth month 
        driver.findElement(By.xpath("//select[contains(@title,'Month')]")).sendKeys("Mar");
        //Enter birth year 
        driver.findElement(By.xpath("//select[contains(@title,'Year')]")).sendKeys("1996");
		//Enter the Gender
        driver.findElement(By.xpath("//label[.='Male']")).click();
        //Click the Submit button
		driver.findElement(By.name("websubmit")).click();
	}

}
