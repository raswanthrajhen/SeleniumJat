package task21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NextedFrame {

	public static void main(String[] args) {
		//Instantiate Driver
		WebDriver driver=new ChromeDriver();
		
		//Maximize Window
		driver.manage().window().maximize();
		
		//open the url
		driver.get("http://the-internet.herokuapp.com/nested_frames");
		
		//find the WebElement for frame
		WebElement frame=driver.findElement(By.xpath("//frame[@name='frame-top']"));
		
		driver.switchTo().frame(frame);
		
		//find the WebElement for Left-frame
		WebElement frameOne=driver.findElement(By.xpath("//frame[@name='frame-left']"));
	
		//Switch to frame
		driver.switchTo().frame(frameOne);
		
		//This element is inside 2 nested frames.
		String body=driver.findElement(By.tagName("body")).getText();
		
		
		if("LEFT".equals(body))
			System.out.println("The frame have word 'left'");
		
		//Switch to parentframe
		driver.switchTo().parentFrame();
		
		//find the WebElement for Middle-frame
		WebElement frameMiddle=driver.findElement(By.xpath("//frame[@name='frame-middle']"));
		
		//Switch to frame
		driver.switchTo().frame(frameMiddle);
		
		String bodyMiddle=driver.findElement(By.tagName("body")).getText();
		
		if("MIDDLE".equals(bodyMiddle))
			System.out.println("The frame have word 'MIDDLE'");
	
		driver.switchTo().parentFrame();
		
		//find the WebElement for Right-frame
		WebElement frameRight=driver.findElement(By.xpath("//frame[@name='frame-right']")); 
		
		//Switch to frame
		driver.switchTo().frame(frameRight);
		
		String bodyRight=driver.findElement(By.tagName("body")).getText();
		
		if("RIGHT".equals(bodyRight))
			System.out.println("The frame have word 'RIGHT'");
		
		//Switch to parentframe
		driver.switchTo().parentFrame();
		
		//Switch to parentframe
		driver.switchTo().parentFrame();
		
		//find the WebElement for Bottom-frame
		WebElement frameButtom=driver.findElement(By.xpath("//frame[@name='frame-bottom']")); 
	
		//Switch to frame
		driver.switchTo().frame(frameButtom);
		
		String bodyBOTTOM=driver.findElement(By.tagName("body")).getText();
		
		if("BOTTOM".equals(bodyBOTTOM))
			System.out.println("The frame have word 'BOTTOM'");
		
	}

}

/*/*
The frame have word 'left'
The frame have word 'MIDDLE'
The frame have word 'RIGHT'
The frame have word 'BOTTOM'
 * /
 */