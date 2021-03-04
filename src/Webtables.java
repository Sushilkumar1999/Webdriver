
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       System.setProperty("webdriver.chrome.driver", "/home/sushilnayaktecn/Downloads/chromedriver");

		
	    WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
		
		List col = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr/th"));
		System.out.println("Total columns: " +col.size());
		
		List rows = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		System.out.println("Total rows: " +rows.size());
		
		WebElement Cellineed = driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[5]/td[2]"));
		System.out.println("Cell i need: " +Cellineed.getText());
		
        WebElement element = driver.findElement(By.xpath("//*[text()='HTML Table - Add a Caption']"));
        
        JavascriptExecutor var1 = (JavascriptExecutor) driver;
        
        var1.executeScript("arguments[0].scrollIntoView();", element);
		
	}

}
