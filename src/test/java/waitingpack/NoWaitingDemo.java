package waitingpack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoWaitingDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.className("dropbtn")).click();
		//Thread.sleep(10000);
		driver.findElement(By.linkText("Flipkart")).click();

	}

}
