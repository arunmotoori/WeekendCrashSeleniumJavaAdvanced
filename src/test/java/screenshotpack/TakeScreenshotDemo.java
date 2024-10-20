package screenshotpack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshotDemo {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshotFile,new File(System.getProperty("user.dir")+"\\screenshots\\omayo.png"));
		
		driver.findElement(By.name("userid")).sendKeys("arunmotoori");
		
		screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshotFile,new File(System.getProperty("user.dir")+"\\screenshots\\omayo2.png"));
		
		driver.findElement(By.linkText("jqueryui")).click();
		
		screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshotFile,new File(System.getProperty("user.dir")+"\\screenshots\\jquery.png"));
		
		driver.quit();
		
	}

}
