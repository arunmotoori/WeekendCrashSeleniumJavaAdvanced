package tablespack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDemoTwo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		//List<WebElement> datas = driver.findElements(By.xpath("//table[@id='table1']//td"));
		//List<WebElement> datas = driver.findElements(By.xpath("//table[@id='table1']//tr[1]/td"));
		//List<WebElement> datas = driver.findElements(By.xpath("//table[@id='table1']//tr[2]/td"));
		//List<WebElement> datas = driver.findElements(By.xpath("//table[@id='table1']//tr[3]/td[2]"));
		List<WebElement> datas = driver.findElements(By.xpath("//table[@id='table1']//tr/td[3]"));
		
		for(WebElement data : datas) {
			System.out.println(data.getText());
		}
		
		driver.quit();

	}

}
