package task16;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instantiate a FirefoxDriver class.   
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Open google 
		driver.get("https://www.google.com");
		
		// Maximize window
		driver.manage().window().maximize();
		
		//quit the all window
		driver.quit();
	}

}
