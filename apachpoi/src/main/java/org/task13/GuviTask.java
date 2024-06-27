package org.task13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuviTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.guvi.in/register/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("name")).sendKeys("Raswanth");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Ras@gmail,com");		
	}

}
