package task16;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instantiate ChromeDriver
		WebDriver driver=new ChromeDriver();
		
		//ImplicitWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		//Open DemoBlaze
		driver.get("https://www.demoblaze.com");
		
		//maximizes the window
		driver.manage().window().maximize();
		
		//Close all the window
		driver.quit();
	}

}
