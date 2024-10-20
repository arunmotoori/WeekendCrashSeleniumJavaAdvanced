package javascriptexecutorpack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunJavaScriptCodeDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
//		JavascriptExecutor jseDriver = (JavascriptExecutor)driver;
//		jseDriver.executeScript("alert('Myself Arun Motoori.I am the founder of this website i.e. QAFox.com. Kindly bookmark this website and share in your circles'); ");
		
//		WebElement alertButton = driver.findElement(By.id("alert1"))
//		((JavascriptExecutor)driver).executeScript("arguments[0].click();",alertButton);
		
//		WebElement textAreaField = driver.findElement(By.id("ta1"));
//		((JavascriptExecutor)driver).executeScript("arguments[0].value='Arun Motoori'",textAreaField);

		
		//((JavascriptExecutor)driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
		WebElement button2 = driver.findElement(By.id("but2"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()",button2);
	}

}
