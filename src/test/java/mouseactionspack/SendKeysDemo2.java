package mouseactionspack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysDemo2 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		driver.findElement(By.id("input-email")).sendKeys("amotooricap1@gmail.com");
		driver.findElement(By.id("input-email")).sendKeys(Keys.TAB);
		driver.findElement(By.id("input-password")).sendKeys("12345");
		driver.findElement(By.id("input-password")).sendKeys(Keys.TAB);
		driver.findElement(By.id("input-password")).sendKeys(Keys.TAB);
		driver.findElement(By.id("input-password")).sendKeys(Keys.ENTER);
		
	}

}
