package calendarpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectDateInCalendarDemo {

	public static void main(String[] args) {
	
		String expectedYear = "2027";
		String expectedMonth = "November";
		String expectedDay = "25";
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.id("datepicker")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
		
		String actualYear = driver.findElement(By.className("ui-datepicker-year")).getText();
		
		while(!actualYear.equals(expectedYear)) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			actualYear = driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		
		String actualMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		
		while(!actualMonth.equals(expectedMonth)) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			actualMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		
		String xpathText = "//td[@*='selectDay']/a[text()='"+expectedDay+"']";
		
		driver.findElement(By.xpath(xpathText)).click();

	}

}
