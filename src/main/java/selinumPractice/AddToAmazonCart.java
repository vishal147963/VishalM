package selinumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToAmazonCart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("apple charger");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Apple 20W USB-C Power Adapter (for iPhone, iPad & AirPods)')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
//		driver.findElement(By.xpath("//span[contains(text(),'Add t')]")).click();
		driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]")).click();
	
	}
}
