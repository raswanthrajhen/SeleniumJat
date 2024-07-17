package task22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Arrays;

public class PhpTravels {

	public static void main(String[] args) throws InterruptedException {
		// Instantiate WebDriver
		WebDriver driver=new ChromeDriver();
		
		//Open WebPage
		driver.get("https://phptravels.com/demo/");
		
		//Maximize Window
		driver.manage().window().maximize();
		
		//Send the keys
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Rasswanth");
		
		//Send the keys
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Rajhen");
		
		//Find the Element of dropdownMenu
		WebElement dropdownMenu=driver.findElement(By.xpath("//select[@id='country_id']"));
		
		//Create Action Class 
	    Actions actions = new Actions(driver);
	     
	    actions.moveToElement(dropdownMenu).perform();
	    
	    
	    // Initialize WebDriverWait
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

        // Wait for the option to be visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='99']")));
	     
        // Locate and click on an option
        WebElement option1 = driver.findElement(By.xpath("//option[@value='99']"));
        
        option1.click();
		
        driver.findElement(By.name("whatsapp")).sendKeys("9789654321");
        
        driver.findElement(By.name("business_name")).sendKeys("anugraha");
        
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("raswanth@gmail.com");
        
        // Get the Value
        String value=driver.findElement(By.xpath("(//h5[@class='cw w-100 text-center'])[1]")).getText();
		
        String[] parts = value.split(" ");
        
        //Get the First value
        int num1 = Integer.parseInt(parts[0]);
        
        String operator = parts[1];
        
       //Get the Second value
        int num2 = Integer.parseInt(parts[2]);
        
        //Add the both Value
        int values=num1+num2;
        
        //Send the value
        driver.findElement(By.xpath("//input[@id='number']")).sendKeys(String.valueOf(values));
        
        driver.findElement(By.xpath("//small[normalize-space()='Submit']")).click();
	}

}
