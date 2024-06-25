package task16;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikipediaBrowser {

	public static void main(String[] args) {
	
		// Instantiate ChromeDriver
		WebDriver driver=new ChromeDriver();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
		
		//Open Browser
		driver.get("https://www.wikipedia.com");
		
		//Maximax Window
		driver.manage().window().maximize();
		
		//Serach 
		driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence");
		
		//click search Button
		driver.findElement(By.xpath("//i[@class='sprite svg-search-icon']")).click();
		
		// Close the All Windows
		driver.quit();
		
	}

}
