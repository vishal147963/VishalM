 package selinumPractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.function.Function;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FlentWtPract {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		Wait<WebDriver>wait=new FluentWait<WebDriver>(driver)
		                    .withTimeout(Duration.ofSeconds(30))
		                    .pollingEvery(Duration.ofSeconds(5))
		                    .ignoring(Exception.class);
		
		WebElement wb=wait.until(new Function<WebDriver,WebElement>()
				{
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.id("btnLogin"));
			}
			});
			wb.click();
			
			TakesScreenshot ts=(TakesScreenshot)driver;
			    File f= ts.getScreenshotAs(OutputType.FILE);
			    FileUtils.copyFile(f,new File("D:\\Auto\\Silanium\\Screenshot\\flue.png"));
				}
	}


