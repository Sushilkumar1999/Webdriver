import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testclass {
	
	WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Testclass obj = new Testclass();
		
		obj.setup();
		obj.login();
		//obj.close();
		
		
		
		
	}
	
	public void setup() {
		
        System.setProperty("webdriver.chrome.driver", "/home/sushilnayaktecn/Downloads/chromedriver");
        System.setProperty("webdriver.gecko.driver", "/home/sushilnayaktecn/Downloads/geckodriver");
		
	    driver = new ChromeDriver();
		
		driver.get("https://www.simplilearn.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
	}
	
	public void login() {
		
       WebElement lnkLogin = driver.findElement(By.linkText("Log in"));
		
		lnkLogin.click();
		
		//driver.quit();
		
		WebElement welcomeback = driver.findElement(By.xpath("//*[contains(text(),'Welcome')]")); //to find a string
		//*[contains(text(),'Welcome')]
		WebElement editUsername = driver.findElement(By.xpath("//input[@name='user_login']"));
		
		editUsername.sendKeys("abc@xyz.com");
		
		WebElement editpwd = driver.findElement(By.xpath("//input[@name='user_login']"));
		
		editpwd.sendKeys("123");
		
		WebElement chkbox = driver.findElement(By.xpath("//input[@id='remember-me']"));
		
		chkbox.click();
		
		WebElement btnpwd = driver.findElement(By.name("btn_login"));
		
		btnpwd.click();
		
		WebElement error = driver.findElement(By.id("msg_box"));
        
        String ActError = error.getText();
        
        String ExpError = "The email or password you have entered is invalid.";
        
        if(ActError.equals(ExpError)) {
            
            System.out.println("TC Passed");
            
        }else {
            
            System.out.println("TC Failed");
        }
        
	}
	
	public void close() {
		
		driver.quit();
		
	}

}
