package framespack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandingFramesDemo5 {
	
	 public static void main(String[] args) throws InterruptedException {
		
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://letcode.in/frame");
		 
		 String pageHeading =  driver.findElement(By.tagName("h1")).getText();
		 
		 System.out.println(pageHeading);
		 
		 driver.switchTo().frame("firstFr");
		 
		 driver.findElement(By.name("fname")).sendKeys("Arun");
		 
		 driver.findElement(By.name("lname")).sendKeys("Motoori");
		 
		 WebElement innerFrameElement = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		 
		 driver.switchTo().frame(innerFrameElement);
		 
		 driver.findElement(By.name("email")).sendKeys("amotoori@gmail.com");
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.name("email")).clear();
		 
		 Thread.sleep(3000);
		 
		 driver.switchTo().parentFrame();
		 
		 driver.findElement(By.name("fname")).clear();
		 
		 driver.findElement(By.name("lname")).clear();
		 
		 driver.switchTo().defaultContent();
		 
		 Thread.sleep(3000);
		 
		 pageHeading =  driver.findElement(By.tagName("h1")).getText();
		 
		 System.out.println(pageHeading);
		 
		 Thread.sleep(3000);
		 
		 driver.quit();
		 
	 }

}
