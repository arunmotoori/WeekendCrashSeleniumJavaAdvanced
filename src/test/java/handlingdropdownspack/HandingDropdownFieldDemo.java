package handlingdropdownspack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandingDropdownFieldDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement dropdownField = driver.findElement(By.id("drop1"));
		
		Select select = new Select(dropdownField);
		
		Thread.sleep(3000);
		
		select.selectByVisibleText("doc 3");
		
		Thread.sleep(3000);
		
		select.selectByIndex(2);
		
		Thread.sleep(3000);
		
		select.selectByValue("mno");

	}

}
