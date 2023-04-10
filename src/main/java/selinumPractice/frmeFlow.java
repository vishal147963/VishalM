package selinumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frmeFlow {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();

	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	
	Thread.sleep(4000);
	driver.switchTo().frame("classFrame");
   driver.findElement(By.linkText("org.openqa.selenium.docker.v1_41")).click();
   
   Thread.sleep(4000);
   driver.switchTo().defaultContent();
   driver.navigate().refresh();
   
   
   Thread.sleep(4000);
   WebElement wb=driver.findElement(By.xpath("//iframe[@name=\"packageListFrame\"]"));
   driver.switchTo().frame(wb);
   driver.findElement(By.linkText("org.openqa.selenium.cli")).click();
   
   Thread.sleep(4000);
   driver.switchTo().frame(2);
   driver.findElement(By.linkText("AbstractAnnotations")).click();
	}

}