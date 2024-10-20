package mouseactionspack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		driver.findElement(By.id("input-email")).sendKeys("amotooricap1@gmail.com");
		
		Actions actions = new Actions(driver);
		
		actions.pause(Duration.ofSeconds(2)).sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
		.sendKeys("12345").pause(Duration.ofSeconds(2))	.sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(2)).sendKeys(Keys.TAB).pause(Duration.ofSeconds(2))
		.sendKeys(Keys.ENTER).pause(Duration.ofSeconds(2)).build().perform();
		
		

	}

}
