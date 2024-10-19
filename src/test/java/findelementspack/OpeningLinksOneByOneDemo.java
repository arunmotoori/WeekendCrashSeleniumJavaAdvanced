package findelementspack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningLinksOneByOneDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@id='LinkList1']//li/a"));
		
		int count = links.size();
		
		for(int i=1;i<=count;i++) {
			
			String xpathText = "(//div[@id='LinkList1']//li/a)["+i+"]";
			WebElement link = driver.findElement(By.xpath(xpathText));
			link.click();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println("----------------");
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			
		}
		
		driver.quit();

	}

}
