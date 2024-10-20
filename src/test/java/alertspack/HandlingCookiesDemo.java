package alertspack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingCookiesDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://qasim.orderapp.online");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
