package handlingwindowspack;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindowsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		String parentWindowId = driver.getWindowHandle();
		
		driver.findElement(By.id("ta1")).sendKeys("Arun Motoori");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("selenium143")).click();
		
		Set<String> windowIds = driver.getWindowHandles();
		
		String selenium143ChildWindowId = null;
		
		for(String windowId : windowIds) {
			
			if(!parentWindowId.equals(windowId)) {
				selenium143ChildWindowId = windowId;
				break;
			}
			
		}
		
		driver.findElement(By.linkText("Open a popup window")).click();
		
		windowIds = driver.getWindowHandles();
		
		String popupChildWindowId = null;
		
		for(String windowId : windowIds) {
			
			if(!(parentWindowId.equals(windowId) || selenium143ChildWindowId.equals(windowId))) {
				popupChildWindowId = windowId;	 		
			}
		}
		
		driver.switchTo().window(popupChildWindowId);
		
		String popupWindowHeading = driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
		System.out.println(popupWindowHeading);
		driver.close();
		
		Thread.sleep(2000);
		
		driver.switchTo().window(selenium143ChildWindowId);
		
		System.out.println(driver.getTitle());
		driver.close();
		
		Thread.sleep(2000);
		
		driver.switchTo().window(parentWindowId);
		
		driver.findElement(By.id("ta1")).clear();
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
