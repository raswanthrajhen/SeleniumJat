package task21;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewWindow {

	public static void main(String[] args) throws InterruptedException {
		// Instantiate WebDriver
		WebDriver driver=new ChromeDriver();
		
		//Open Url
		driver.get("https://the-internet.herokuapp.com/windows");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		  // Get the handle of the current window
		 String originalWindow = driver.getWindowHandle();
		
		//maximize window
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[.='Click Here']")).click();
		
		Thread.sleep(3000);
		 // Wait for the new window to appear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		 
        // Get the handle of the new window
        Set<String> allWindows = driver.getWindowHandles();
        
        String newWindowHandle = null;
        for (String handle : allWindows) {
            if (!handle.equals(originalWindow)) {
                newWindowHandle = handle;
                break;
            }
        }
        
        // Switch to the new window
        driver.switchTo().window(newWindowHandle);
		
        // Switch back to the original window
		driver.close();
	}

}
