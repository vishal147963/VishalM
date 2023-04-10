package Mock;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetWindowHandle {
	public static void main(String[] args) throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();	
		driver.get("https://prafpawar11.github.io/multiplewindows.html");
		driver.findElement(By.xpath("//input[@name=\"fname\"]")).sendKeys("Vishal");
		String parent = driver.getWindowHandle();
//		System.out.println(parent);
		
		Thread.sleep(5000);
		driver.findElement(By.linkText("Visit Facebook")).click();
		Thread.sleep(5000);
		
		Set<String> allwindow = driver.getWindowHandles();
//		System.out.println(allwindow.size());
		String a="";
		for(String ab:allwindow) {
			if(ab!=(parent)) {
				a=ab;
			}
//			System.out.println(a);
		}
		driver.switchTo().window(a);
		
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Tom");
		driver.findElement(By.xpath("//input[@name=\"firstname\"]/following::input[@name=\"lastname\"]"))
				.sendKeys("Rose");
		driver.findElement(By.name("reg_email__")).sendKeys("new user");
		Thread.sleep(5000);
		driver.switchTo().window(parent);
		driver.findElement(By.name("lname")).sendKeys("patil");

		Thread.sleep(5000);
		driver.manage().window().minimize();
		driver.close();
		driver.quit();

	}
}
