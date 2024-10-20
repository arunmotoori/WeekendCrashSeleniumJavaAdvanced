package mouseactionspack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Actions actions = new Actions(driver);
		
		WebElement osloOption = driver.findElement(By.id("box1"));
		WebElement norwayOption = driver.findElement(By.id("box101"));
		
		actions.dragAndDrop(osloOption,norwayOption).perform();

	}

}
