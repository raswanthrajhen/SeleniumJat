package org.task13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlaze {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.demoblaze.com/");
		 driver.manage().window().maximize();//
		 //Thread.sleep(5000);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.findElement(By.id("signin2")).click();
		 						
		 driver.findElement(By.id("sign-username")).sendKeys("raswanth1@gmail.com");
		 driver.findElement(By.id("sign-password")).sendKeys("12345");
		 
		 driver.findElement(By.xpath("//button[.='Sign up']")).click();	
		 
		 //driver.findElement(By.xpath("//button[.='LOGIN']")).click();
		 
		//img[@alt='First slide']
		 
	}

}
