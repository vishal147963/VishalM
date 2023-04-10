package selinumPractice;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class ExpFlueSync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe" );
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			
			//WebDriverWait wait=new WebDriverWait(driver,30);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnLog"))).click();
			
	Wait<WebDriver>wait=new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(30))
			.pollingEvery(Duration.ofSeconds(5))
			.ignoring(Exception.class);
	
	WebElement login=wait.until(new Function<WebDriver,WebElement>()
	{
		public WebElement apply(WebDriver driver) {
			return driver.findElement(By.id("btnLogin"));
		}
	});
	login.click();
	}

}
