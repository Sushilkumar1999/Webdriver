import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/home/sushilnayaktecn/Downloads/chromedriver");

		
	    WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
		
        //WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
       // WebElement email = driver.findElement(By.cssSelector("input#email"));
		
		//email.sendKeys("abc@xyz.com");
		
		//WebElement passwd = driver.findElement(By.xpath("//input[@name='pass']"));
		//WebElement passwd = driver.findElement(By.cssSelector("input#pass"));
		
		//passwd.sendKeys("1234");
		
       // WebElement button = driver.findElement(By.xpath("//button[@name='login']"));
      //WebElement button = driver.findElement(By.cssSelector("button[name=login]"));
        
        //button.click();
		
		WebElement createAc = driver.findElement(By.xpath("//*[contains(text(),'Create New Account')]"));
		createAc.click();
		WebElement Firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		Firstname.sendKeys("sushil");
		WebElement Lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		Lastname.sendKeys("kumar");
		WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
	    email.sendKeys("abc@xyz.com");
	    WebElement emailconf = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
	    emailconf.sendKeys("abc@xyz.com");
		WebElement passwd = driver.findElement(By.xpath("//input[@id='password_step_input']"));
		passwd.sendKeys("1234");
		
		WebElement Month = driver.findElement(By.xpath("//*[@name='birthday_month']"));
	
		Select ddmonth=new Select(Month);
		ddmonth.selectByIndex(3);
		

		WebElement Day = driver.findElement(By.xpath("//*[@name='birthday_day']"));
		//Day.click();
		Select date=new Select(Day);
		date.selectByIndex(10);
		
		WebElement Year = driver.findElement(By.xpath("//*[@name='birthday_year']"));
		//Year.click();
		Select yr=new Select(Year);
		yr.selectByIndex(19);
		
		WebElement Gender = driver.findElement(By.xpath("//*[text()='Male']"));
		Gender.click();
		
		WebElement Submit = driver.findElement(By.xpath("//button[@name='websubmit']"));
		Submit.click();
		
	}

}
