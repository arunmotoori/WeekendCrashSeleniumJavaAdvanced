package alertspack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingBootstrapModelDialogDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_modal.asp");
		
		driver.findElement(By.xpath("//button[text()='Click To Open Modal']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement heading = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("myModalLabel")));

		System.out.println(heading.getText());
		
		System.out.println(driver.findElement(By.xpath("//div[@class='modal-body']/p")).getText());
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//button[@data-dismiss='modal'])[2]")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
